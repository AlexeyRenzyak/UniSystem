import java.util.Vector;

public  interface Researcher
{
	public void createResearchPaper(ResearchPaper parameter);
	public void createResearchProject(ResearchProject parameter);
	public boolean getIsReseacher();
	public Vector<ResearchPaper> getResearchPapers();
	public Vector<ResearchPaper> getResearchProjects();
	public void joinResearchProject(ResearchProject parameter);
	public void printPapers();
	public void updateResearchProject(ResearchProject parameter, String parameter2);
	
	
}

