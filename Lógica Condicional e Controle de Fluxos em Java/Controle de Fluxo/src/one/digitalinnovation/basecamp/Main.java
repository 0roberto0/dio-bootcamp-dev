package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
//        switchNumero();
//        switchFerias();

    }

    private static void ifFlecha() {
        int mes = 9;

        if (mes ==1){
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("dezembro");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifSemFlecha() {

        int mes = 9;

        if (mes ==1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("outubro");
        } else if (mes == 11) {
            System.out.println("novembro");
        } else if (mes == 12) {
            System.out.println("dezembro");
        }
    }

    private static void ifFerias() {
        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro" ) {
            System.out.println("Ferias");
        }
    }

    private static void ifMenor(){

        double salarioMensal = 11893.58D;
        double mediaSalario = 10500D;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && quantidadeDependentes >= mediaDependentes) {
            System.out.println("Funcionarios deve receber auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxilio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionario deve receber auxilio.");
        } else {
            System.out.println("Funcionario não deve receber auxilio.");
        }
    }

    private  static void switchSemana() {

        String dia = "terça";
        switch (dia) {
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                break;
        }

    }
}
