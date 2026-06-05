package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import t6.e0;
import t6.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f3862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3863b;

    public k(m mVar, v vVar) {
        this.f3863b = mVar;
        this.f3862a = vVar;
    }

    @Override // t6.h0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iL0;
        b bVar = this.f3862a.f3899d;
        m mVar = this.f3863b;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar.f3872v0.getLayoutManager();
            View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            iL0 = viewN0 == null ? -1 : e0.H(viewN0);
        } else {
            iL0 = ((LinearLayoutManager) mVar.f3872v0.getLayoutManager()).L0();
        }
        Calendar calendarA = z.a(bVar.f3842a.f3883a);
        calendarA.add(2, iL0);
        r rVar = new r(calendarA);
        mVar.f3868r0 = rVar;
        MaterialButton materialButton = mVar.A0;
        Calendar calendarA2 = z.a(bVar.f3842a.f3883a);
        calendarA2.add(2, iL0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = z.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z.f3904a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.P(bVar.f3842a.f(rVar));
    }
}
