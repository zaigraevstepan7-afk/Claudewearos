package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.anonlab.voidlauncher.R;
import java.util.Calendar;
import t6.f0;
import t6.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v extends t6.x {

    /* renamed from: d, reason: collision with root package name */
    public final b f3899d;

    /* renamed from: e, reason: collision with root package name */
    public final yh.c f3900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3901f;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, yh.c cVar) {
        r rVar = bVar.f3842a;
        r rVar2 = bVar.f3843b;
        r rVar3 = bVar.f3845d;
        if (rVar.f3883a.compareTo(rVar3.f3883a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (rVar3.f3883a.compareTo(rVar2.f3883a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f3901f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.f3890d) + (p.Q(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f3899d = bVar;
        this.f3900e = cVar;
        if (this.f16076a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f16077b = true;
    }

    @Override // t6.x
    public final int a() {
        return this.f3899d.f3848z;
    }

    @Override // t6.x
    public final long b(int i10) {
        Calendar calendarA = z.a(this.f3899d.f3842a.f3883a);
        calendarA.add(2, i10);
        calendarA.set(5, 1);
        Calendar calendarA2 = z.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // t6.x
    public final void c(t0 t0Var, int i10) {
        u uVar = (u) t0Var;
        b bVar = this.f3899d;
        Calendar calendarA = z.a(bVar.f3842a.f3883a);
        calendarA.add(2, i10);
        r rVar = new r(calendarA);
        uVar.f3897u.setText(rVar.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f3898v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !rVar.equals(materialCalendarGridView.a().f3892a)) {
            new s(rVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // t6.x
    public final t0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.Q(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new u(linearLayout, false);
        }
        linearLayout.setLayoutParams(new f0(-1, this.f3901f));
        return new u(linearLayout, true);
    }
}
