// Generated by Haxe 3.4.2
package hxDaedalus.data.math;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Point2D extends haxe.lang.HxObject
{

	private Point2D()
	{
	}

	public Point2D(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Point2D(java.lang.Object x_, java.lang.Object y_)
	{
		//line 10 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		hxDaedalus.data.math.Point2D.__hx_ctor_hxDaedalus_data_math_Point2D(this, x_, y_);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_math_Point2D(hxDaedalus.data.math.Point2D __hx_this, java.lang.Object x_, java.lang.Object y_)
	{
		//line 10 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		double __temp_y_8 = ( (haxe.lang.Runtime.eq(y_, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y_)) )) );
		//line 10 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		double __temp_x_7 = ( (haxe.lang.Runtime.eq(x_, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x_)) )) );
		//line 11 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		__hx_this.x = __temp_x_7;
		//line 12 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		__hx_this.y = __temp_y_8;
	}
	
	
	
	
	public double x;
	
	public double y;
	
	public void transform(hxDaedalus.data.math.Matrix2D matrix)
	{
		//line 16 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		matrix.tranform(this);
	}
	
	
	public void setXY(double x_, double y_)
	{
		//line 20 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.x = x_;
		//line 21 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.y = y_;
	}
	
	
	public hxDaedalus.data.math.Point2D clone()
	{
		//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		return new hxDaedalus.data.math.Point2D(this.x, this.y);
	}
	
	
	public void substract(hxDaedalus.data.math.Point2D p)
	{
		//line 29 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.x -= p.x;
		//line 30 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.y -= p.y;
	}
	
	
	public double get_length()
	{
		//line 34 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		return java.lang.Math.sqrt(( ( this.x * this.x ) + ( this.y * this.y ) ));
	}
	
	
	public void normalize()
	{
		//line 38 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		double norm = this.get_length();
		//line 39 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.x /= norm;
		//line 40 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.y /= norm;
	}
	
	
	public void scale(double s)
	{
		//line 44 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.x *= s;
		//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		this.y *= s;
	}
	
	
	public double distanceTo(hxDaedalus.data.math.Point2D p)
	{
		//line 49 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		double diffX = ( this.x - p.x );
		//line 50 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		double diffY = ( this.y - p.y );
		//line 51 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		return java.lang.Math.sqrt(( ( diffX * diffX ) + ( diffY * diffY ) ));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("y")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.y = ((double) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("x")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.x = ((double) (value) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("y")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("x")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return value;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			switch (field.hashCode())
			{
				case -1963037360:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("distanceTo")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "distanceTo")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.get_length();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 109250890:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("scale")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "scale")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("x")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.x;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("normalize")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 121:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("y")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.y;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("get_length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_length")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 1052666732:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("transform")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transform")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 530534145:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("substract")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "substract")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 109328099:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("setXY")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setXY")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("clone")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("y")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.y;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.get_length();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 120:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("x")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.x;
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		{
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			switch (field.hashCode())
			{
				case -1963037360:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("distanceTo")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.distanceTo(((hxDaedalus.data.math.Point2D) (dynargs.__get(0)) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 1052666732:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("transform")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.transform(((hxDaedalus.data.math.Matrix2D) (dynargs.__get(0)) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 109250890:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("scale")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.scale(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 109328099:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("setXY")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.setXY(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("normalize")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.normalize();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("clone")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.clone();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("get_length")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						return this.get_length();
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
				case 530534145:
				{
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					if (field.equals("substract")) 
					{
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						__temp_executeDef1 = false;
						//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
						this.substract(((hxDaedalus.data.math.Point2D) (dynargs.__get(0)) ));
					}
					
					//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
					break;
				}
				
				
			}
			
			//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		baseArr.push("y");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		baseArr.push("x");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		baseArr.push("length");
		//line 5 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Point2D.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


