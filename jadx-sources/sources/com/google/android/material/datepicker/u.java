package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import java.lang.reflect.Field;
import t4.l0;
import t6.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u extends t0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3897u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f3898v;

    public u(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3897u = textView;
        Field field = l0.f15744a;
        new t4.z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 1).f(textView, Boolean.TRUE);
        this.f3898v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
