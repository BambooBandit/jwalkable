// Generated by Haxe 3.4.2
package hxDaedalus.data.math;

import java.io.Serializable;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EdgeData extends haxe.lang.HxObject implements Serializable
{
	private static final long serialVersionUID = 41L;

	public EdgeData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EdgeData()
	{
		//line 11 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		hxDaedalus.data.math.EdgeData.__hx_ctor_hxDaedalus_data_math_EdgeData(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_math_EdgeData(hxDaedalus.data.math.EdgeData __hx_this)
	{
	}
	
	
	public double sumDistancesSquared;
	
	public double length;
	
	public int nodesCount;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			switch (field.hashCode())
			{
				case 2082952414:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("nodesCount")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.nodesCount = ((int) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case 1451318868:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("sumDistancesSquared")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.sumDistancesSquared = ((double) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.length = ((double) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			switch (field.hashCode())
			{
				case 2082952414:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("nodesCount")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.nodesCount = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case 1451318868:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("sumDistancesSquared")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.sumDistancesSquared = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						this.length = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			switch (field.hashCode())
			{
				case 2082952414:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("nodesCount")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return this.nodesCount;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case 1451318868:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("sumDistancesSquared")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return this.sumDistancesSquared;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return this.length;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			switch (field.hashCode())
			{
				case 2082952414:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("nodesCount")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return ((double) (this.nodesCount) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case 1451318868:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("sumDistancesSquared")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return this.sumDistancesSquared;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
						return this.length;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		baseArr.push("nodesCount");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		baseArr.push("length");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		baseArr.push("sumDistancesSquared");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/EdgeData.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


