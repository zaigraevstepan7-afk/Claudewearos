package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f3853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3855c;

    public e() {
        Calendar calendarC = z.c(null);
        this.f3853a = calendarC;
        this.f3854b = calendarC.getMaximum(7);
        this.f3855c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3854b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f3854b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f3855c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f3855c;
        int i12 = this.f3854b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f3853a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar calendarC = z.c(null);
        this.f3853a = calendarC;
        this.f3854b = calendarC.getMaximum(7);
        this.f3855c = i10;
    }
}
