package advanced.interoperability;

public class KotlinFromJava {
    public static void main(String[] args) {
        final BookStore bookStore = new BookStore();
        final Book effectiveJava = bookStore.getBook("Effective Java");

        // TODO (1) Vypište do konzole název knihy effectiveJava. Všimněte si jak vypadá volání
        System.out.println();

        // TODO (2) Zavolejte funkci countPages ze souboru utils.kt a vypište pomocí ní počet stránek knihy effectiveJava
        System.out.println("Number of pages in book:" + effectiveJava);

        // TODO (3) Zavolejte funkci printAuthorAndTitle ze souboru utils2.kt a vypište pomocí ní autora a název knihy

        // TODO (4) Přidejte anotaci do souboru utils.kt, která zajistí že následující řádek kódu bude fungovat
        // System.out.println("Number of pages in book:" + BookUtils.countPages(effectiveJava));

        // TODO (5) Upravte soubory utils.kt a utils2.kt, tak aby Místo tříd UtilsKt a Utils2Kt vznikla pouze třída BookUtils
        // BookUtils.printAuthorAndTitle(effectiveJava);
        // System.out.println(BookUtils.countPages(effectiveJava));

        // TODO (6) Upravte třídu Book.kt tak, aby kód na následujícím řádku fungoval
        //System.out.println(effectiveJava.pages);

        // TODO (7) Přidejte do třídy Book konstantu, kterou bude možné získat jako statickou proměnnou.
        // Book.getSomeConstant
        // Book.someConstant

        // TODO (8) Zavolejte metodu sign z kotlin objektu BookService.

        // TODO (9) Zavolejte metodu sign staticky

        // TODO (10) Vyřešte TODO ve třídě BookStore
    }
}
