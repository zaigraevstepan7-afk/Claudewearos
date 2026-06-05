package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4807a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f4808b;

    /* renamed from: c, reason: collision with root package name */
    public int f4809c;

    /* renamed from: d, reason: collision with root package name */
    public float f4810d;

    /* renamed from: e, reason: collision with root package name */
    public String f4811e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4812f;

    /* renamed from: g, reason: collision with root package name */
    public int f4813g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f4808b = bVar.f4808b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f4970d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i10 = 0;
        boolean z2 = false;
        Object objValueOf = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f4808b = i10;
            bVar.f4807a = z2;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (y3.e.b(this.f4808b)) {
            case 0:
            case 7:
                this.f4809c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4810d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4813g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4811e = (String) obj;
                break;
            case 5:
                this.f4812f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4810d = ((Float) obj).floatValue();
                break;
        }
    }
}
