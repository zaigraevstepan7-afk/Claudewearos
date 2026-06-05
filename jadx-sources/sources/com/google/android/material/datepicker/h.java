package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t6.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, int i10, int i11) {
        super(i10);
        this.F = mVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(q0 q0Var, int[] iArr) {
        int i10 = this.E;
        m mVar = this.F;
        if (i10 == 0) {
            iArr[0] = mVar.f3872v0.getWidth();
            iArr[1] = mVar.f3872v0.getWidth();
        } else {
            iArr[0] = mVar.f3872v0.getHeight();
            iArr[1] = mVar.f3872v0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final void y0(RecyclerView recyclerView, int i10) {
        x xVar = new x(recyclerView.getContext());
        xVar.f16030a = i10;
        z0(xVar);
    }
}
