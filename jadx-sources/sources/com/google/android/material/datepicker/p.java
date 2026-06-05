package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t4.d0;
import t4.l0;
import t4.n1;
import t4.o1;
import t4.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class p<S> extends w5.p {
    public final LinkedHashSet C0;
    public final LinkedHashSet D0;
    public int E0;
    public w F0;
    public b G0;
    public m H0;
    public int I0;
    public CharSequence J0;
    public boolean K0;
    public int L0;
    public int M0;
    public CharSequence N0;
    public int O0;
    public CharSequence P0;
    public int Q0;
    public CharSequence R0;
    public int S0;
    public CharSequence T0;
    public TextView U0;
    public CheckableImageButton V0;
    public ef.i W0;
    public boolean X0;
    public CharSequence Y0;
    public CharSequence Z0;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.C0 = new LinkedHashSet();
        this.D0 = new LinkedHashSet();
    }

    public static int P(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = z.b();
        calendarB.set(5, 1);
        Calendar calendarA = z.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Q(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(uk.c.O(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i10});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // w5.p, w5.t
    public final void D(Bundle bundle) {
        super.D(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.E0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.G0;
        a aVar = new a();
        int i10 = a.f3839b;
        int i11 = a.f3839b;
        long j = bVar.f3842a.f3888f;
        long j4 = bVar.f3843b.f3888f;
        aVar.f3840a = Long.valueOf(bVar.f3845d.f3888f);
        int i12 = bVar.f3846e;
        d dVar = bVar.f3844c;
        m mVar = this.H0;
        r rVar = mVar == null ? null : mVar.f3868r0;
        if (rVar != null) {
            aVar.f3840a = Long.valueOf(rVar.f3888f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r rVarB = r.b(j);
        r rVarB2 = r.b(j4);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f3840a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(rVarB, rVarB2, dVar2, l10 == null ? null : r.b(l10.longValue()), i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.I0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.J0);
        bundle.putInt("INPUT_MODE_KEY", this.L0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.N0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.O0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.P0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.R0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.S0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.T0);
    }

    @Override // w5.p, w5.t
    public final void E() throws Resources.NotFoundException {
        super.E();
        Dialog dialog = this.x0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.K0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.W0);
            if (!this.X0) {
                View viewFindViewById = J().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListI = u0.b.i(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListI != null ? Integer.valueOf(colorStateListI.getDefaultColor()) : null;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int i10 = u2.b.i(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(i10);
                }
                wd.a.N(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z10 = u2.b.l(0) || u2.b.l(numValueOf.intValue());
                p7.k kVar = new p7.k(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                (i11 >= 35 ? new p1(window, kVar) : i11 >= 30 ? new o1(window, kVar) : new n1(window, kVar)).f0(z10);
                boolean z11 = u2.b.l(0) || u2.b.l(i10);
                p7.k kVar2 = new p7.k(window.getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                (i12 >= 35 ? new p1(window, kVar2) : i12 >= 30 ? new o1(window, kVar2) : new n1(window, kVar2)).e0(z11);
                o oVar = new o(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                Field field = l0.f15744a;
                d0.i(viewFindViewById, oVar);
                this.X0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.W0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.x0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new we.a(dialog2, rect));
        }
        I();
        int i13 = this.E0;
        if (i13 == 0) {
            O();
            throw null;
        }
        O();
        b bVar = this.G0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i13);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f3845d);
        mVar.M(bundle);
        this.H0 = mVar;
        w wVar = mVar;
        if (this.L0 == 1) {
            O();
            b bVar2 = this.G0;
            w qVar = new q();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i13);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            qVar.M(bundle2);
            wVar = qVar;
        }
        this.F0 = wVar;
        this.U0.setText((this.L0 == 1 && I().getResources().getConfiguration().orientation == 2) ? this.Z0 : this.Y0);
        O();
        throw null;
    }

    @Override // w5.p, w5.t
    public final void F() {
        this.F0.f3902o0.clear();
        super.F();
    }

    @Override // w5.p
    public final Dialog N() {
        Context contextI = I();
        I();
        int i10 = this.E0;
        if (i10 == 0) {
            O();
            throw null;
        }
        Dialog dialog = new Dialog(contextI, i10);
        Context context = dialog.getContext();
        this.K0 = Q(context, android.R.attr.windowFullscreen);
        this.W0 = new ef.i(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, me.a.f11652l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.W0.k(context);
        this.W0.n(ColorStateList.valueOf(color));
        this.W0.m(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void O() {
        if (this.f18763f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // w5.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // w5.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Z;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // w5.p, w5.t
    public final void w(Bundle bundle) throws Resources.NotFoundException {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f18763f;
        }
        this.E0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.G0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.I0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.J0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.L0 = bundle.getInt("INPUT_MODE_KEY");
        this.M0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.O0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.Q0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.S0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.T0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.J0;
        if (text == null) {
            text = I().getResources().getText(this.I0);
        }
        this.Y0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.Z0 = text;
    }

    @Override // w5.t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.K0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.K0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(P(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(P(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.V0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.U0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.V0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.V0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, u6.v.G(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], u6.v.G(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.V0.setChecked(this.L0 != 0);
        l0.l(this.V0, null);
        CheckableImageButton checkableImageButton2 = this.V0;
        this.V0.setContentDescription(this.L0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.V0.setOnClickListener(new n(this, 0));
        O();
        throw null;
    }
}
