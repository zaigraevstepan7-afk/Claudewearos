package w5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import t.m1;
import w2.o2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f18785a;

    public y(i0 i0Var) {
        this.f18785a = i0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        n0 n0VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        i0 i0Var = this.f18785a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, i0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v5.a.f17864a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = t.class.isAssignableFrom(c0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    t tVarB = resourceId != -1 ? i0Var.B(resourceId) : null;
                    if (tVarB == null && string != null) {
                        tVarB = i0Var.C(string);
                    }
                    if (tVarB == null && id2 != -1) {
                        tVarB = i0Var.B(id2);
                    }
                    if (tVarB == null) {
                        c0 c0VarG = i0Var.G();
                        context.getClassLoader();
                        tVarB = c0VarG.a(attributeValue);
                        tVarB.G = true;
                        tVarB.Q = resourceId != 0 ? resourceId : id2;
                        tVarB.R = id2;
                        tVarB.S = string;
                        tVarB.H = true;
                        tVarB.M = i0Var;
                        v vVar = i0Var.f18662w;
                        tVarB.N = vVar;
                        w wVar = vVar.f18777e;
                        tVarB.X = true;
                        if ((vVar != null ? vVar.f18776d : null) != null) {
                            tVarB.X = true;
                        }
                        n0VarG = i0Var.a(tVarB);
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "Fragment " + tVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (tVarB.H) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        tVarB.H = true;
                        tVarB.M = i0Var;
                        v vVar2 = i0Var.f18662w;
                        tVarB.N = vVar2;
                        w wVar2 = vVar2.f18777e;
                        tVarB.X = true;
                        if ((vVar2 != null ? vVar2.f18776d : null) != null) {
                            tVarB.X = true;
                        }
                        n0VarG = i0Var.g(tVarB);
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + tVarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    x5.b bVar = x5.c.f19834a;
                    x5.c.b(new x5.d(tVarB, viewGroup, 0));
                    x5.c.a(tVarB).getClass();
                    tVarB.Y = viewGroup;
                    n0VarG.k();
                    n0VarG.j();
                    View view2 = tVarB.Z;
                    if (view2 == null) {
                        throw new IllegalStateException(m1.j("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (tVarB.Z.getTag() == null) {
                        tVarB.Z.setTag(string);
                    }
                    tVarB.Z.addOnAttachStateChangeListener(new o2(this, n0VarG));
                    return tVarB.Z;
                }
            }
        }
        return null;
    }
}
