package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3896b;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3896b = vVar;
        this.f3895a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f3895a;
        s sVarA = materialCalendarGridView.a();
        if (i10 < sVarA.a() || i10 > sVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((m) this.f3896b.f3900e.f20314b).f3867q0.f3844c.f3852a) {
            throw null;
        }
    }
}
