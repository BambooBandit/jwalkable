// Generated by Haxe 3.4.2
package hxDaedalus.data.math;

import java.io.Serializable;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NodeData extends haxe.lang.HxObject implements Serializable
{
	private static final long serialVersionUID = 44L;

	public NodeData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public NodeData()
	{
		//line 9 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		hxDaedalus.data.math.NodeData.__hx_ctor_hxDaedalus_data_math_NodeData(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_math_NodeData(hxDaedalus.data.math.NodeData __hx_this)
	{
	}
	
	
	public int index;
	
	public hxDaedalus.data.math.Point2D point;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		{
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			switch (field.hashCode())
			{
				case 100346066:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("index")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						this.index = ((int) (value) );
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return value;
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
			}
			
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		{
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			switch (field.hashCode())
			{
				case 106845584:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("point")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						this.point = ((hxDaedalus.data.math.Point2D) (value) );
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return value;
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
				case 100346066:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("index")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						this.index = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return value;
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
			}
			
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		{
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			switch (field.hashCode())
			{
				case 106845584:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("point")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return this.point;
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
				case 100346066:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("index")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return this.index;
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
			}
			
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		{
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			switch (field.hashCode())
			{
				case 100346066:
				{
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					if (field.equals("index")) 
					{
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						__temp_executeDef1 = false;
						//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
						return ((double) (this.index) );
					}
					
					//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
					break;
				}
				
				
			}
			
			//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		baseArr.push("point");
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		baseArr.push("index");
		//line 4 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/NodeData.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


