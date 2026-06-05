package v3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import f1.g0;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends h {
    public final View T;
    public final o2.d U;
    public s1.d V;
    public ej.c W;

    /* renamed from: a0, reason: collision with root package name */
    public ej.c f17861a0;

    /* renamed from: b0, reason: collision with root package name */
    public ej.c f17862b0;

    public w(Context context, ej.c cVar, g0 g0Var, s1.e eVar, int i10, r1 r1Var) {
        View view = (View) cVar.invoke(context);
        o2.d dVar = new o2.d();
        super(context, g0Var, i10, dVar, view, r1Var);
        this.T = view;
        this.U = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objD = eVar != null ? eVar.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (eVar != null) {
            setSavableRegistryEntry(eVar.e(strValueOf, new g(this, 2)));
        }
        b bVar = b.f17811e;
        this.W = bVar;
        this.f17861a0 = bVar;
        this.f17862b0 = bVar;
    }

    public static final void n(w wVar) {
        wVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(s1.d dVar) {
        s1.d dVar2 = this.V;
        if (dVar2 != null) {
            ((p1.l) dVar2).I();
        }
        this.V = dVar;
    }

    public final o2.d getDispatcher() {
        return this.U;
    }

    public final ej.c getReleaseBlock() {
        return this.f17862b0;
    }

    public final ej.c getResetBlock() {
        return this.f17861a0;
    }

    public /* bridge */ /* synthetic */ w2.a getSubCompositionView() {
        return null;
    }

    public final ej.c getUpdateBlock() {
        return this.W;
    }

    public final void setReleaseBlock(ej.c cVar) {
        this.f17862b0 = cVar;
        setRelease(new g(this, 3));
    }

    public final void setResetBlock(ej.c cVar) {
        this.f17861a0 = cVar;
        setReset(new g(this, 4));
    }

    public final void setUpdateBlock(ej.c cVar) {
        this.W = cVar;
        setUpdate(new g(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
