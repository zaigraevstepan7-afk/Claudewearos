package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import java.util.Locale;
import t6.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 extends t6.x {

    /* renamed from: d, reason: collision with root package name */
    public final m f3849d;

    public b0(m mVar) {
        this.f3849d = mVar;
    }

    @Override // t6.x
    public final int a() {
        return this.f3849d.f3867q0.f3847f;
    }

    @Override // t6.x
    public final void c(t0 t0Var, int i10) {
        m mVar = this.f3849d;
        int i11 = mVar.f3867q0.f3842a.f3885c + i10;
        TextView textView = ((a0) t0Var).f3841u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        Context context = textView.getContext();
        textView.setContentDescription(z.b().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        c cVar = mVar.f3870t0;
        if (z.b().get(1) == i11) {
            p9.a aVar = cVar.f3851b;
        } else {
            p9.a aVar2 = cVar.f3850a;
        }
        throw null;
    }

    @Override // t6.x
    public final t0 d(ViewGroup viewGroup) {
        return new a0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
