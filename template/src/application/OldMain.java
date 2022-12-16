package application;

import entities.Estoque;
import entities.Usuario;
import entities.UsuarioADM;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.DecimalFormat;
import java.text.ParseException;

public class OldMain{
    public static ImageIcon icon = new ImageIcon("images/checkmark.png");

    public static void main(String[] args){
        JFormattedTextField dateMaskTXT = new JFormattedTextField();
        
        try {
            MaskFormatter dateMask = new MaskFormatter("##/##");
            dateMask.install(dateMaskTXT);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        DecimalFormat codigoFormat  = new DecimalFormat("000000");
        
        Usuario    u    = new Usuario();
        UsuarioADM uADM = new UsuarioADM();
        Estoque    e    = new Estoque();
        
        APP:
        do{
            LOGIN_SCREEN:
            do{
                JTextField usuarioTXT      = new JTextField();        usuarioTXT.setText("");
                JTextField nomeTXT         = new JTextField();        nomeTXT.setText("");
                JTextField senhaTXT        = new JPasswordField();    senhaTXT.setText("");
                JTextField senhaConfirmTXT = new JPasswordField();    senhaConfirmTXT.setText("");
                                                                      dateMaskTXT.setText("");

                Object[] loginScreen = {"Login", "Cadastrar", "Cancelar"};
                
                int option = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Bem-vindo(a)!", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, loginScreen, loginScreen[0]);

                switch (option){
                    case 0: { //Login (LOGIN_SCREEN)
                        Object[] login = {"Usuário:", usuarioTXT, "Senha:", senhaTXT};

                        do{
                            option = JOptionPane.showConfirmDialog(null, login, "Login", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

                            if (option == JOptionPane.OK_OPTION){
                                boolean loginOk = u.login(usuarioTXT.getText(), senhaTXT.getText());
                                if (loginOk){
                                    JOptionPane.showMessageDialog(null,"Login efetuado com sucesso!\n\nBem vindo(a) "+u.getNome()+"!","Login",JOptionPane.INFORMATION_MESSAGE,icon);
                                    break LOGIN_SCREEN;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Usuário ou senha incoretos, tente novamente","Login",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else if(option == JOptionPane.CANCEL_OPTION){
                                break;
                            }
                        }while (true);
                    }
                    case 1: { //Cadastro (LOGIN_SCREEN)
                        Object[] cadastro = {"Nome de exibição:", nomeTXT, "Usuário:", usuarioTXT, "Senha:", senhaTXT, "Confirmar Senha:", senhaConfirmTXT};

                        do{
                            option = JOptionPane.showConfirmDialog(null, cadastro, "Cadastro de Usuário", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

                            if(option == JOptionPane.OK_OPTION){
                                if (senhaTXT.getText().equals(senhaConfirmTXT.getText())){
                                    Object[] cadastroType = {"Administrador", "Padrão"};

                                    int tipo = JOptionPane.showOptionDialog(null, "Qual o tipo deste usuário?", "Cadastro de Usuário", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, cadastroType, cadastroType[0]);

                                    int ID = Estoque.listEstoque.size()+1;

                                    boolean OK;

                                    if (tipo == 0){
                                        OK = uADM.cadastrarUduario(nomeTXT.getText(), usuarioTXT.getText(), senhaTXT.getText(), tipo, ID);
                                    }
                                    else{
                                        OK = u.cadastrarUduario(nomeTXT.getText(), usuarioTXT.getText(), senhaTXT.getText(), tipo, ID);
                                    }

                                    if (OK){
                                        u.login(usuarioTXT.getText(), senhaTXT.getText());

                                        JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!\n\nBem-vindo(a) "+nomeTXT.getText()+"!","Cadastro de Usuário -- "+u.getNome(),JOptionPane.INFORMATION_MESSAGE,icon);
                                        break LOGIN_SCREEN;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null,"Erro ao efetuar o cadastro\nTente novamente","Cadastro de Usuário",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"As senhas não correspondem, tente novamente","Cadastro de Usuário",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                break;
                            }
                        }while (true);
                    }
                    case 2: { //Cancelar (LOGIN_SCREEN)
                        break APP;
                    }
                }
            }while(true);
            
            //in App
            if (u.getTipo() == 0) {
                MENU_ADM:
                do {
                    Object[] ADMoptions = {"Cadastrar Novo Alimento", "Verificar Estoque", "Editar Item do Estoque", "Limpar Cadastros de Usuários", "Editar Usuário", "Efetuar Logout", "Sair"};

                    int option = JOptionPane.showOptionDialog(null, "O que deseja?", "Opções de Administrador -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ADMoptions, ADMoptions[0]);

                    switch (option) {
                        case 0: { //Cadastrar Novo Alimento (MENU_ADM)
                            JTextField alimentoTXT = new JTextField();
                            alimentoTXT.setText("");
                            JTextField fornecedorTXT = new JTextField();
                            fornecedorTXT.setText("");
                            JTextField quantidadeTXT = new JTextField();
                            quantidadeTXT.setText("");
                            dateMaskTXT.setText("");

                            Object[] cadastroProduto = {"Alimento:", alimentoTXT, "Fornecedor:", fornecedorTXT, "Quantidade em Estoque:", quantidadeTXT, "Validade (mm/aa):", dateMaskTXT};

                            do {
                                option = JOptionPane.showConfirmDialog(null, cadastroProduto, "Cadastro de Alimento -- " + u.getNome(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                if (option == JOptionPane.OK_OPTION) {
                                    Object[] cadastroProdutoPt2 = {"Peressível", "Não Peressível", "Voltar"};

                                    int tipo = JOptionPane.showOptionDialog(null, "Tipo de Produto", "Cadastro de Alimento -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, cadastroProdutoPt2, cadastroProdutoPt2[0]);

                                    int validadeMes = Integer.parseInt(dateMaskTXT.getText().substring(0, 2));
                                    int validadeAno = Integer.parseInt(dateMaskTXT.getText().substring(3));

                                    if (tipo != 2) {
                                        String s_tipo;

                                        if (tipo == 0) {
                                            s_tipo = "Peressível";
                                        } else {
                                            s_tipo = "Não Peressível";
                                        }

                                        option = JOptionPane.showConfirmDialog(null, "Alimento: " + alimentoTXT.getText() + "\nQtd: " + quantidadeTXT.getText() +
                                                "\nFornecedor: " + fornecedorTXT.getText() + "\nValidade: " +
                                                dateMaskTXT.getText() + "\n" + s_tipo +
                                                "\n\nConfirma o cadastro?", "Cadastro de Alimento -- " + u.getNome(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                                        if (option == JOptionPane.YES_OPTION) {
                                            int codigo = Estoque.listEstoque.size() + 1;
                                            boolean retorno = e.cadastrarProduto(alimentoTXT.getText(), fornecedorTXT.getText(), tipo, Integer.parseInt(quantidadeTXT.getText()), validadeMes, validadeAno, codigo);

                                            if (retorno) {
                                                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\n\nCódigo do cadastro: " + codigoFormat.format(codigo), "Cadastro de Alimento -- " + u.getNome(), JOptionPane.INFORMATION_MESSAGE, icon);
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } while (true); //Fim (CADASTRO_ALIMENTOS)
                        }
                        case 1: { //Verificar Estoque (MENU_ADM)
                            Object[] verificarEstoqueOptions = {"Buscar Item por Código", "Vericicação Sequencial", "Voltar"};

                            VERIFICACAO_ESTOQUE:
                            do {
                                option = JOptionPane.showOptionDialog(null, "O que deseja?", "Verificação de Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, verificarEstoqueOptions, verificarEstoqueOptions[0]);

                                switch (option) {
                                    case 0: { //Buscar Item por Código (VERIFICACAO_ESTOQUE)
                                        Object[] verificacaoPontual = {"Nova Busca", "Encerrar Verificações"};

                                        do {
                                            String codigo = JOptionPane.showInputDialog(null, "Insira o código do Produto à ser buscado:", "Verificação Pontual de Estoque -- " + u.getNome(), JOptionPane.QUESTION_MESSAGE);

                                            if (codigo != null) {
                                                boolean OK = e.verificacaoPontual(Integer.parseInt(codigo));

                                                if (OK) {
                                                    String s_tipo;
                                                    if (e.getTipo() == 0) {
                                                        s_tipo = "Peressível";
                                                    } else {
                                                        s_tipo = "Não Peressível";
                                                    }

                                                    option = JOptionPane.showOptionDialog(null, "Código: " + codigoFormat.format(e.getCodigo()) + "\nAlimento: " + e.getAlimento() + "\nQtd em estoque: " + e.getQuantidade() +
                                                                    "\nFornecedor: " + e.getFornecedor() + "\nValidade: " +
                                                                    e.getValidadeCompleta() + "\n" + s_tipo,
                                                            "Verificação Sequencial de Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                            null, verificacaoPontual, verificacaoPontual[0]);

                                                } else {
                                                    Object[] erroVerificacao = {"Inserir novo código", "Cancelar Verificação Pontual"};

                                                    option = JOptionPane.showOptionDialog(null, "O código inserido não corresponde a nenhum item no estoque", "Verificação Pontual de Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, erroVerificacao, erroVerificacao[0]);

                                                }
                                                if (option == 1) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } while (true);
                                    }
                                    case 1: { //Verificação Sequencial (VERIFICACAO_ESTOQUE)
                                        Object[] verificacaoSequencial = {"Próximo", "Anterior", "Interromper Verificação"};

                                        for (int i = 0; i < Estoque.listEstoque.size(); i++) {
                                            boolean OK = e.verificacaoSequencial(i);

                                            if (OK) {
                                                String s_tipo;
                                                if (e.getTipo() == 0) {
                                                    s_tipo = "Peressível";
                                                } else {
                                                    s_tipo = "Não Peressível";
                                                }

                                                option = JOptionPane.showOptionDialog(null, "Código: " + codigoFormat.format(e.getCodigo()) + "\nAlimento: " + e.getAlimento() + "\nQtd em estoque: " + e.getQuantidade() +
                                                                "\nFornecedor: " + e.getFornecedor() + "\nValidade: " +
                                                                e.getValidadeCompleta() + "\n" + s_tipo,
                                                        "Verificação Sequencial de Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                        null, verificacaoSequencial, verificacaoSequencial[0]);

                                                if (option == 1) {
                                                    i -= 2;
                                                } else if (option == 2) {
                                                    break;
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Não há itens anteriores a este.", "Verificação Sequencial de Estoque -- " + u.getNome(), JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        JOptionPane.showMessageDialog(null, "Não há mais itens a serem verificados", "Verificação Sequencial de Estoque -- " + u.getNome(), JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    case 2: { //Voltar (VERIFICACAO_ESTOQUE)
                                        break VERIFICACAO_ESTOQUE;
                                    }
                                }
                            } while (true); //Fim (VERIFICACAO_ESTOQUE)
                        }
                        case 2: { //Editar Item do Estoque (MENU_ADM)
                            EDITAR_ITEM_ESTOQUE:
                            do {
                                String codigo = JOptionPane.showInputDialog(null, "Insira o código do item à ser editado:", "Editar Item do Estoque -- " + u.getNome(), JOptionPane.QUESTION_MESSAGE);

                                if (codigo != null) {

                                    boolean OK = false;

                                    for (Estoque estoque : Estoque.listEstoque) {
                                        if (estoque.getCodigo() == Integer.parseInt(codigo)) {
                                            OK = true;
                                            e.setAlimento(estoque.getAlimento());
                                            e.setFornecedor(estoque.getFornecedor());
                                            e.setQuantidade(estoque.getQuantidade());
                                            e.setTipo(estoque.getTipo());
                                            e.setValidadeA(estoque.getValidadeA());
                                            e.setValidadeM(estoque.getValidadeM());
                                        }
                                    }

                                    if (OK) {
                                        String s_tipo;
                                        if (e.getTipo() == 0) {
                                            s_tipo = "Peressível";
                                        } else {
                                            s_tipo = "Não Peressível";
                                        }

                                        JTextField alimentoTXT = new JTextField();
                                        alimentoTXT.setText(e.getAlimento());
                                        JTextField fornecedorTXT = new JTextField();
                                        fornecedorTXT.setText(e.getFornecedor());
                                        JTextField quantidadeTXT = new JTextField();
                                        quantidadeTXT.setText("" + e.getQuantidade());
                                        dateMaskTXT.setText(e.getValidadeCompleta());

                                        Object[] editarItemEstoque = {"Alimento:", alimentoTXT, "Fornecedor:", fornecedorTXT, "Quantidade em Estoque:", quantidadeTXT, "Validade (mm/aa):", dateMaskTXT},
                                                editarItemEstoquept2 = {"Peressível", "Não Peressível", "Voltar"};
                                        do {
                                            option = JOptionPane.showConfirmDialog(null, editarItemEstoque, "Editar Item do Estoque -- " + u.getNome(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                            if (option == JOptionPane.OK_OPTION) {
                                                int tipo = JOptionPane.showOptionDialog(null, "Tipo de Produto\nAtual: " + s_tipo, "Editar Item do Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, editarItemEstoquept2, editarItemEstoquept2[0]);

                                                int validadeMes = Integer.parseInt(dateMaskTXT.getText().substring(0, 2));
                                                int validadeAno = Integer.parseInt(dateMaskTXT.getText().substring(3));

                                                if (tipo != JOptionPane.CANCEL_OPTION) {
                                                    if (e.getTipo() == 0) {
                                                        s_tipo = "Peressível";
                                                    } else {
                                                        s_tipo = "Não Peressível";
                                                    }

                                                    option = JOptionPane.showConfirmDialog(null, "Alimento: " + alimentoTXT.getText() + "\nQtd: " + quantidadeTXT.getText() +
                                                            "\nFornecedor: " + fornecedorTXT.getText() + "\nValidade: " +
                                                            dateMaskTXT.getText() + "\n" + s_tipo +
                                                            "\n\nConfirma alteração?", "Editar Item do Estoque -- " + u.getNome(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                                                    if (option == JOptionPane.YES_OPTION) {
                                                        boolean retorno = e.editarItem(alimentoTXT.getText(), fornecedorTXT.getText(), tipo, Integer.parseInt(quantidadeTXT.getText()), validadeMes, validadeAno, Integer.parseInt(codigo));

                                                        if (retorno) {
                                                            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!", "Editar Item do Estoque -- " + u.getNome(), JOptionPane.INFORMATION_MESSAGE, icon);
                                                        }
                                                        break EDITAR_ITEM_ESTOQUE;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        } while (true);
                                    } else {
                                        Object[] erroEdicao = {"Inserir novo código", "Cancelar Edição"};

                                        option = JOptionPane.showOptionDialog(null, "O código inserido não corresponde a nenhum item no estoque", "Editar Item do Estoque -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, erroEdicao, erroEdicao[0]);

                                        if (option == 1) {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } while (true); //Fim (EDITAR_ITEM_ESTOQUE)
                        }
                        case 3: { //Limpar Cadastros de usuários(MENU_ADM)
                            do {
                                boolean BDlimpo = uADM.limparCadastrosDeUsuarios();

                                if (BDlimpo) {
                                    JOptionPane.showMessageDialog(null, "Cadastros limpos com sucesso!", "Limpar Cadastros -- " + u.getNome(), JOptionPane.INFORMATION_MESSAGE, icon);
                                    break;
                                } else {
                                    Object[] erroLimpezaBD = {"Tentar Novamente", "Cancelar"};

                                    option = JOptionPane.showOptionDialog(null, "Erro ao limpar os cadastros", "Limpar Cadastros -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, erroLimpezaBD, erroLimpezaBD[0]);

                                    if (option == 1) {
                                        break;
                                    }
                                }
                            } while (true);
                        }
                        case 4: { //Editar Usuario (MENU_ADM)
                            EDITAR_USUARIO:
                            do {
                                for (Usuario listUsuario : Usuario.listUsuarios) {
                                    if (listUsuario.getNome().equals(u.getNome())) {
                                        listUsuario.setNome(listUsuario.getNome());
                                        listUsuario.setSenha(listUsuario.getSenha());
                                        listUsuario.setUsuario(listUsuario.getUsuario());
                                        listUsuario.setID(listUsuario.getID());
                                    }
                                }

                                JTextField usuarioTXT = new JTextField();
                                usuarioTXT.setText(u.getUsuario());
                                JTextField nomeTXT = new JTextField();
                                nomeTXT.setText(u.getNome());
                                JTextField senhaTXT = new JTextField();
                                senhaTXT.setText("");
                                JTextField senhaConfirmTXT = new JTextField();
                                senhaConfirmTXT.setText("");

                                Object[] edicaoUsuario = {"Novo nome de exibição:", nomeTXT, "Novo usuário:", usuarioTXT, "Nova senha:", senhaTXT, "Confirmar nova senha:", senhaConfirmTXT};

                                do {
                                    option = JOptionPane.showConfirmDialog(null, edicaoUsuario, "Edição de Usuário -- " + u.getNome(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                    if (option == JOptionPane.OK_OPTION) {
                                        if (senhaTXT.getText().equals(senhaConfirmTXT.getText())) {
                                            boolean OK = uADM.editarUsuario(nomeTXT.getText(), usuarioTXT.getText(), senhaTXT.getText(), u.getID());

                                            if (OK) {
                                                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!" + nomeTXT.getText() + "!", "Edição de Usuário -- " + u.getNome(), JOptionPane.INFORMATION_MESSAGE, icon);
                                                break EDITAR_USUARIO;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Erro ao editar o usuario\nTente novamente", "Edição de Usuário -- " + u.getNome(), JOptionPane.ERROR_MESSAGE);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "As senhas não correspondem, tente novamente", "Edição de Usuário -- " + u.getNome(), JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        break EDITAR_USUARIO;
                                    }
                                } while (true);
                            } while (true);
                        }
                        case 5: { //Efetuar Logout (MENU_ADM)
                            break MENU_ADM;
                        }
                        case 6: { //Sair (MENU_ADM)
                            break APP;
                        }
                    }
                } while (true); //Fim (MENU_ADM)
            }
            else {
                MENU_PADRAO:
                do {
                    Object[] padraoOptions = {"Realisar Pedido", "Realizar Pagamento", "Efetuar Logout", "Sair"};

                    int option = JOptionPane.showOptionDialog(null, "O que deseja?", "Segmentos de Usuário Padrão -- " + u.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, padraoOptions, padraoOptions[0]);

                    switch (option) {
                        case 0: {

                        }
                        case 1: {

                        }
                        case 2: { //Efetuar Logout (MENU_PADRAO)
                            break MENU_PADRAO;
                        }
                        case 3: { //Sair (MENU_PADRAO)
                            break APP;
                        }
                    }
                } while (true); //Fim (MENU_PADRAO)
            }
        }while(true); //Fim (APP)
    }
}