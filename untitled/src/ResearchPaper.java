import java.util.Date;
import java.util.Vector;

public class ResearchPaper {

    private String title;
    private Vector<Researcher> authors;
    private Journal journal;
    private int pages ;
    private Date publicationDate;
    private String doi;
    private int citations;

    public ResearchPaper(String title, Vector<Researcher> authors, Journal journal, int pages, String doi, int citations, Date publicationDate) {
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.pages = pages;
        this.doi = doi;
        this.citations = citations;
        this.publicationDate = publicationDate;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Vector<Researcher> getAuthors() {
        return authors;
    }

    public void setAuthors(Vector<Researcher> authors) {
        this.authors = authors;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public String getCitation(Format format) {
        //TODO
        return "";
    }
    public String toString() {
        //TODO
        return "";
    }
    
    
}
