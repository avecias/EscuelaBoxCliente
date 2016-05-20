/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Thu Apr 07 13:42:43 CDT 2016
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.mx.ipn.app.modelo.squirrel;

public class EscuelaKey implements java.io.Serializable, Cloneable {
    /* idEscuela */
    protected int idescuela;

    /* idEscuela */
    public int getIdescuela() {
        return idescuela;
    }

    /* idEscuela */
    public void setIdescuela(int idescuela) {
        this.idescuela = idescuela;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idescuela).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof EscuelaKey))
            return false;

        EscuelaKey key = (EscuelaKey) obj;

        if (this.idescuela != key.idescuela)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        EscuelaKey key = new EscuelaKey();
        key.idescuela = this.idescuela;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idescuela").append(" = ").append(idescuela).append("]");
        return sb.toString();
    }
}