public class AssignmentValueVsReference {
    public static void main(String[] args) {
        Pessoa jedi = new Pessoa("Obi-Wan Kenobi");
        String padawan = "Anakin Skywalker";
        int idadePadawan = 19;

        System.out.println("=== Antes do Conselho Jedi ===");
        System.out.println("Jedi: " + jedi.nome);
        System.out.println("Padawan: " + padawan);
        System.out.println("Idade do Padawan: " + idadePadawan);

        conselhoJedi(jedi, padawan, idadePadawan);

        
        System.out.println("\n=== Depois do Conselho Jedi ===");
        System.out.println("Jedi: " + jedi.nome);               
        System.out.println("Padawan: " + padawan);             
        System.out.println("Idade do Padawan: " + idadePadawan);
    }

    private static void conselhoJedi(Pessoa mestre, String aprendiz, int idade){
        mestre.nome = "Mestre " + mestre.nome; 
        aprendiz = "Darth Vader";              
        idade += 10;                           
        System.out.println("\n[Durante o Conselho]");
        System.out.println("Mestre renomeado: " + mestre.nome);
        System.out.println("Novo nome do aprendiz: " + aprendiz);
        System.out.println("Nova idade: " + idade);
    }
}

class Pessoa {
    String nome;
    Pessoa(String nome) {
        this.nome = nome;
    }
}
