// Generated by Haxe 3.4.2
package haxe.lang;

import java.io.Serializable;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Closure extends haxe.lang.VarArgsBase implements Serializable
{
	private static final long serialVersionUID = 21L;
	public Closure(java.lang.Object obj, java.lang.String field)
	{
		//line 71 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		super(-1, -1);
		//line 72 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		this.obj = obj;
		//line 73 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		this.field = field;
	}
	
	
	public java.lang.Object obj;
	
	public java.lang.String field;
	
	@Override public java.lang.Object __hx_invokeDynamic(haxe.root.Array dynArgs)
	{
		//line 78 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		return haxe.lang.Runtime.callField(this.obj, this.field, dynArgs);
	}
	
	
	@Override public boolean equals(java.lang.Object obj)
	{
		//line 83 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		if (( obj == null )) 
		{
			//line 84 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
			return false;
		}
		
		//line 86 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		haxe.lang.Closure c = ((haxe.lang.Closure) (obj) );
		//line 87 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		if (haxe.lang.Runtime.eq(c.obj, this.obj)) 
		{
			//line 87 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
			return haxe.lang.Runtime.valEq(c.field, this.field);
		}
		else
		{
			//line 87 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
			return false;
		}
		
	}
	
	
	@Override public int hashCode()
	{
		//line 92 "/Users/tao/.hvm/versions/haxe/3.4.2/std/java/internal/Function.hx"
		return ( ((int) (haxe.lang.Runtime.toInt(this.obj.hashCode())) ) ^ ((int) (this.field.hashCode()) ) );
	}
	
	
}


