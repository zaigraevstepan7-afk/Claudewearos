package w2;

import android.R;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f0 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f18254a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(d3.r rVar) {
        d3.n nVarK = rVar.k();
        return !nVarK.f4758a.c(d3.v.j);
    }

    public static final boolean c(d3.r rVar, Resources resources) {
        Object objG = rVar.f4766d.f4758a.g(d3.v.f4776a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !d3.u.g(rVar) && (rVar.f4766d.f4760c || (rVar.q() && ((list != null ? (String) qi.l.A0(list) : null) != null || l(rVar) != null || k(rVar, resources) != null || j(rVar))));
    }

    public static final void d(d3.r rVar, u4.e eVar) {
        d3.n nVar = rVar.f4766d;
        q.g0 g0Var = nVar.f4758a;
        Object objG = nVar.f4758a.g(d3.v.f4800z);
        if (objG == null) {
            objG = null;
        }
        d3.j jVar = (d3.j) objG;
        if (b(rVar)) {
            if (jVar != null && jVar.f4723a == 8) {
                return;
            }
            Object objG2 = g0Var.g(d3.m.f4756y);
            if (objG2 == null) {
                objG2 = null;
            }
            d3.a aVar = (d3.a) objG2;
            if (aVar != null) {
                eVar.b(new u4.c(R.id.accessibilityActionPageUp, aVar.f4703a));
            }
            Object objG3 = g0Var.g(d3.m.A);
            if (objG3 == null) {
                objG3 = null;
            }
            d3.a aVar2 = (d3.a) objG3;
            if (aVar2 != null) {
                eVar.b(new u4.c(R.id.accessibilityActionPageDown, aVar2.f4703a));
            }
            Object objG4 = g0Var.g(d3.m.f4757z);
            if (objG4 == null) {
                objG4 = null;
            }
            d3.a aVar3 = (d3.a) objG4;
            if (aVar3 != null) {
                eVar.b(new u4.c(R.id.accessibilityActionPageLeft, aVar3.f4703a));
            }
            Object objG5 = g0Var.g(d3.m.B);
            d3.a aVar4 = (d3.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                eVar.b(new u4.c(R.id.accessibilityActionPageRight, aVar4.f4703a));
            }
        }
    }

    public static final boolean e(Object obj) {
        if (obj instanceof t1.o) {
            t1.o oVar = (t1.o) obj;
            if (oVar.c() == f1.f.f6290d || oVar.c() == f1.f.f6293z || oVar.c() == f1.f.f6291e) {
                Object value = oVar.getValue();
                if (value == null) {
                    return true;
                }
                return e(value);
            }
        } else {
            if ((obj instanceof pi.c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f18254a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final int g(View view, int i10) {
        int i11 = 0;
        int i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i10);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i12 = i11;
            }
            i11++;
            Object objF = u3.a.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return i12;
    }

    public static final View h(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(g(view, com.anonlab.voidlauncher.R.id.view_tree_lifecycle_owner), g(view, com.anonlab.voidlauncher.R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i10 = 0;
        View view3 = view2;
        while (view != null) {
            if (i10 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (i(view) == null) {
                i10++;
                Object objF = u3.a.f(view);
                View view4 = view2;
                view2 = view;
                view = objF instanceof View ? (View) objF : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final d1 i(View view) {
        Object tag = view.getTag(com.anonlab.voidlauncher.R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (d1) weakReference.get();
        }
        return null;
    }

    public static final boolean j(d3.r rVar) {
        Object objG = rVar.f4766d.f4758a.g(d3.v.K);
        if (objG == null) {
            objG = null;
        }
        f3.a aVar = (f3.a) objG;
        q.g0 g0Var = rVar.f4766d.f4758a;
        Object objG2 = g0Var.g(d3.v.f4800z);
        if (objG2 == null) {
            objG2 = null;
        }
        d3.j jVar = (d3.j) objG2;
        boolean z2 = aVar != null;
        Object objG3 = g0Var.g(d3.v.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (jVar != null && jVar.f4723a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String k(d3.r rVar, Resources resources) throws Resources.NotFoundException {
        d3.n nVar = rVar.f4766d;
        d3.n nVar2 = rVar.f4766d;
        Object objG = nVar.f4758a.g(d3.v.f4777b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        q.g0 g0Var = nVar2.f4758a;
        Object objG2 = g0Var.g(d3.v.K);
        if (objG2 == null) {
            objG2 = null;
        }
        f3.a aVar = (f3.a) objG2;
        Object objG3 = g0Var.g(d3.v.f4800z);
        if (objG3 == null) {
            objG3 = null;
        }
        d3.j jVar = (d3.j) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new b3.e();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.anonlab.voidlauncher.R.string.indeterminate);
                    }
                } else if (jVar != null && jVar.f4723a == 2 && objG == null) {
                    objG = resources.getString(com.anonlab.voidlauncher.R.string.state_off);
                }
            } else if (jVar != null && jVar.f4723a == 2 && objG == null) {
                objG = resources.getString(com.anonlab.voidlauncher.R.string.state_on);
            }
        }
        Object objG4 = g0Var.g(d3.v.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((jVar == null || jVar.f4723a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.anonlab.voidlauncher.R.string.selected) : resources.getString(com.anonlab.voidlauncher.R.string.not_selected);
            }
        }
        Object objG5 = g0Var.g(d3.v.f4778c);
        if (objG5 == null) {
            objG5 = null;
        }
        d3.i iVar = (d3.i) objG5;
        if (iVar != null) {
            if (iVar != d3.i.f4720c) {
                if (objG == null) {
                    kj.d dVar = iVar.f4722b;
                    float f10 = dVar.f9664b;
                    float f11 = dVar.f9663a;
                    float f12 = f10 - f11 == 0.0f ? 0.0f : (iVar.f4721a - f11) / (dVar.f9664b - f11);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    objG = resources.getString(com.anonlab.voidlauncher.R.string.template_percent, Integer.valueOf(f12 == 0.0f ? 0 : f12 == 1.0f ? 100 : cg.b.p(Math.round(f12 * 100), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(com.anonlab.voidlauncher.R.string.in_progress);
            }
        }
        d3.y yVar = d3.v.G;
        if (g0Var.c(yVar)) {
            q.g0 g0Var2 = new d3.r(rVar.f4763a, true, rVar.f4765c, nVar2).k().f4758a;
            Object objG6 = g0Var2.g(d3.v.f4776a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = g0Var2.g(d3.v.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = g0Var2.g(yVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.anonlab.voidlauncher.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final g3.f l(d3.r rVar) {
        d3.n nVar = rVar.f4766d;
        d3.y yVar = d3.v.f4776a;
        g3.f fVar = (g3.f) d3.u.f(nVar, d3.v.G);
        List list = (List) d3.u.f(rVar.f4766d, d3.v.C);
        return fVar == null ? list != null ? (g3.f) qi.l.A0(list) : null : fVar;
    }

    public static boolean m() {
        try {
            if (t.f18376g1 == null) {
                t.f18376g1 = Class.forName("android.os.SystemProperties");
            }
            if (t.f18377h1 == null) {
                Class cls = t.f18376g1;
                t.f18377h1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = t.f18377h1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return fj.l.b(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final g3.k0 n(d3.n nVar) {
        ej.c cVar;
        ArrayList arrayList = new ArrayList();
        Object objG = nVar.f4758a.g(d3.m.f4733a);
        if (objG == null) {
            objG = null;
        }
        d3.a aVar = (d3.a) objG;
        if (aVar == null || (cVar = (ej.c) aVar.f4704b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (g3.k0) arrayList.get(0);
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final boolean p(float f10, float f11, c2.j jVar) {
        b2.c cVar = new b2.c(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        c2.j jVarA = c2.l.a();
        c2.j.b(jVarA, cVar);
        c2.j jVarA2 = c2.l.a();
        jVarA2.i(jVar, jVarA, 1);
        boolean zIsEmpty = jVarA2.f3006a.isEmpty();
        jVarA2.j();
        jVarA.j();
        return !zIsEmpty;
    }

    public static final boolean q(float f10, float f11, float f12, float f13, long j) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void r(float[] fArr, float[] fArr2) {
        float f10 = f(fArr2, 0, fArr, 0);
        float f11 = f(fArr2, 0, fArr, 1);
        float f12 = f(fArr2, 0, fArr, 2);
        float f13 = f(fArr2, 0, fArr, 3);
        float f14 = f(fArr2, 1, fArr, 0);
        float f15 = f(fArr2, 1, fArr, 1);
        float f16 = f(fArr2, 1, fArr, 2);
        float f17 = f(fArr2, 1, fArr, 3);
        float f18 = f(fArr2, 2, fArr, 0);
        float f19 = f(fArr2, 2, fArr, 1);
        float f20 = f(fArr2, 2, fArr, 2);
        float f21 = f(fArr2, 2, fArr, 3);
        float f22 = f(fArr2, 3, fArr, 0);
        float f23 = f(fArr2, 3, fArr, 1);
        float f24 = f(fArr2, 3, fArr, 2);
        float f25 = f(fArr2, 3, fArr, 3);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
    }

    public static final v3.h s(p0 p0Var, int i10) {
        Object next;
        Iterator<T> it = p0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((v2.f0) ((Map.Entry) next).getKey()).f17624b == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (v3.h) entry.getValue();
        }
        return null;
    }

    public static final String t(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String u(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
