package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t6.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3858c;

    public /* synthetic */ f(m mVar, v vVar, int i10) {
        this.f3856a = i10;
        this.f3858c = mVar;
        this.f3857b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3856a) {
            case 0:
                m mVar = this.f3858c;
                int iL0 = ((LinearLayoutManager) mVar.f3872v0.getLayoutManager()).L0() - 1;
                Calendar calendarA = z.a(this.f3857b.f3899d.f3842a.f3883a);
                calendarA.add(2, iL0);
                mVar.N(new r(calendarA));
                break;
            default:
                m mVar2 = this.f3858c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.f3872v0.getLayoutManager();
                View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int iH = viewN0 == null ? -1 : e0.H(viewN0);
                Calendar calendarA2 = z.a(this.f3857b.f3899d.f3842a.f3883a);
                calendarA2.add(2, iH + 1);
                mVar2.N(new r(calendarA2));
                break;
        }
    }
}
