package post;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TimeLine {

    private ArrayList<Post> listaPostsPublicados = new ArrayList<>();
    private int id;

    public void visualizarPosts() {
        for (Post post : listaPostsPublicados) {
            System.out.println(post.toString());
        }
    }
    
    public int curtidasTotais(){
        int curtidasTotais = 0;
        for (Post post : listaPostsPublicados) {
			curtidasTotais += post.getCurtidas();
		}
        return curtidasTotais;
    }
    
    public List<Post> getListaPostsPublicados() {
		return listaPostsPublicados;
	}
    
	@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimeLine other = (TimeLine) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.listaPostsPublicados, other.listaPostsPublicados)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "TimeLine{" + "listaPostsPublicados=" + listaPostsPublicados + ", id=" + id + '}';
    }
}
