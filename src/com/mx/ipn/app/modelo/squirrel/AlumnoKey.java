/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Thu Apr 07 13:42:43 CDT 2016
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.mx.ipn.app.modelo.squirrel;

public class AlumnoKey implements java.io.Serializable, Cloneable {
    /* idAlumno */
    protected int idalumno;

    /* idAlumno */
    public int getIdalumno() {
        return idalumno;
    }

    /* idAlumno */
    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idalumno).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof AlumnoKey))
            return false;

        AlumnoKey key = (AlumnoKey) obj;

        if (this.idalumno != key.idalumno)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        AlumnoKey key = new AlumnoKey();
        key.idalumno = this.idalumno;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idalumno").append(" = ").append(idalumno).append("]");
        return sb.toString();
    }
}