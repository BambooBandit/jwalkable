// Generated by Haxe 3.4.2
package hxDaedalus.iterators;

import java.io.Serializable;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FromVertexToOutgoingEdges extends haxe.lang.HxObject implements Serializable
{
	private static final long serialVersionUID = 53L;

	public FromVertexToOutgoingEdges(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FromVertexToOutgoingEdges()
	{
		//line 18 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		hxDaedalus.iterators.FromVertexToOutgoingEdges.__hx_ctor_hxDaedalus_iterators_FromVertexToOutgoingEdges(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_iterators_FromVertexToOutgoingEdges(hxDaedalus.iterators.FromVertexToOutgoingEdges __hx_this)
	{
		//line 16 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		__hx_this.realEdgesOnly = true;
	}
	
	
	
	
	public hxDaedalus.data.Vertex _fromVertex;
	
	public hxDaedalus.data.Edge _nextEdge;
	
	public boolean realEdgesOnly;
	
	public hxDaedalus.data.Vertex set_fromVertex(hxDaedalus.data.Vertex value)
	{
		//line 26 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		this._fromVertex = value;
		//line 27 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		this._nextEdge = this._fromVertex.get_edge();
		//line 28 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		while (( this.realEdgesOnly &&  ! (this._nextEdge.get_isReal())  ))
		{
			//line 30 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			this._nextEdge = this._nextEdge.get_rotLeftEdge();
		}
		
		//line 32 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		return value;
	}
	
	
	public hxDaedalus.data.Edge _resultEdge;
	
	public hxDaedalus.data.Edge next()
	{
		//line 39 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		if (( this._nextEdge != null )) 
		{
			//line 41 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			this._resultEdge = this._nextEdge;
			//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			while (true)
			{
				//line 44 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				this._nextEdge = this._nextEdge.get_rotLeftEdge();
				//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				if (( this._nextEdge == this._fromVertex.get_edge() )) 
				{
					//line 47 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					this._nextEdge = null;
					//line 48 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				if ( ! ((( this.realEdgesOnly &&  ! (this._nextEdge.get_isReal())  ))) ) 
				{
					//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
			}
			
		}
		else
		{
			//line 54 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			this._resultEdge = null;
		}
		
		//line 57 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		return this._resultEdge;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		{
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			switch (field.hashCode())
			{
				case 516008217:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_resultEdge")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						this._resultEdge = ((hxDaedalus.data.Edge) (value) );
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return value;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case -2064921106:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("fromVertex")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						this.set_fromVertex(((hxDaedalus.data.Vertex) (value) ));
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return value;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case 1055882020:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("realEdgesOnly")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						this.realEdgesOnly = haxe.lang.Runtime.toBool(value);
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return value;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case -976608371:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_fromVertex")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						this._fromVertex = ((hxDaedalus.data.Vertex) (value) );
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return value;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case 1514466479:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_nextEdge")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return value;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		{
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("next")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case -976608371:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_fromVertex")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this._fromVertex;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case 516008217:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_resultEdge")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this._resultEdge;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case 1514466479:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("_nextEdge")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this._nextEdge;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case -761514517:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("set_fromVertex")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_fromVertex")) );
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case 1055882020:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("realEdgesOnly")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this.realEdgesOnly;
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		{
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("next")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this.next();
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
				case -761514517:
				{
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					if (field.equals("set_fromVertex")) 
					{
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						__temp_executeDef1 = false;
						//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
						return this.set_fromVertex(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ));
					}
					
					//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
					break;
				}
				
				
			}
			
			//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		baseArr.push("_resultEdge");
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		baseArr.push("realEdgesOnly");
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		baseArr.push("_nextEdge");
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		baseArr.push("_fromVertex");
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		baseArr.push("fromVertex");
		//line 8 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/iterators/FromVertexToOutgoingEdges.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


