
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Kubus(GL gl) {
              
        
        
        
        
//        gl.glBegin(GL.GL_QUADS);
//       // gl.glColor3f(-2.7f, 0.7f, -1.6f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glEnd();//depan
//
// 
//        gl.glBegin(GL.GL_QUADS);
//        //gl.glColor3f(1.5f, 1.5f, -1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glEnd();//belakang
//        
//        gl.glBegin(GL.GL_QUADS);
//       // gl.glColor3f(-1.5f, 0.5f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glEnd();////kiri
//        
//        gl.glBegin(GL.GL_QUADS);
//       // gl.glColor3f(1.5f, 0.5f, -1.5f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glVertex3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glEnd();//kanan
//        
//        gl.glBegin(GL.GL_QUADS);
//       // gl.glColor3f(-1.5f, -0.2f, 1.3f);
//        gl.glVertex3f(0.0f, 1.0f, 0.0f);
//        gl.glVertex3f(0.0f, 1.0f, 1.0f);
//        gl.glVertex3f(1.0f, 1.0f, 1.0f);
//        gl.glVertex3f(1.0f, 1.0f, 0.0f);
//        gl.glEnd();//atas
//        
//        gl.glBegin(GL.GL_QUADS);
//        //gl.glColor3f(1.5f, 0.5f, 1.0f);
//        gl.glVertex3f(0.0f, 0.0f, 0.0f);
//        gl.glVertex3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 1.0f);
//        gl.glVertex3f(1.0f, 0.0f, 0.0f);
//        gl.glEnd();//bawah
//        

    }

    static void Bola(GL gl) {
         gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(1.0f, 0.0f, 0.0f); // Warna Merah
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3f(0.0f, 1.0f, 0.0f); // Warna Hijau
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glEnd();
//        float BODY_RADIUS = 0.5f;
//        int SLICES = 200;
//        int STACKS = 200;
//        GLU glu = new GLU();
//        GLUquadric q = glu.gluNewQuadric();
//        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
}
