package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import t4.l0;
import t6.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m<S> extends w {
    public MaterialButton A0;
    public AccessibilityManager B0;

    /* renamed from: p0, reason: collision with root package name */
    public int f3866p0;

    /* renamed from: q0, reason: collision with root package name */
    public b f3867q0;

    /* renamed from: r0, reason: collision with root package name */
    public r f3868r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f3869s0;

    /* renamed from: t0, reason: collision with root package name */
    public c f3870t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f3871u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f3872v0;
    public View w0;
    public View x0;
    public View y0;
    public View z0;

    @Override // w5.t
    public final void D(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3866p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3867q0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3868r0);
    }

    public final void N(r rVar) {
        v vVar = (v) this.f3872v0.getAdapter();
        int iF = vVar.f3899d.f3842a.f(rVar);
        AccessibilityManager accessibilityManager = this.B0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iF2 = iF - vVar.f3899d.f3842a.f(this.f3868r0);
            boolean z2 = Math.abs(iF2) > 3;
            boolean z10 = iF2 > 0;
            this.f3868r0 = rVar;
            if (z2 && z10) {
                this.f3872v0.Y(iF - 3);
                this.f3872v0.post(new b8.f(iF, 2, this));
            } else if (z2) {
                this.f3872v0.Y(iF + 3);
                this.f3872v0.post(new b8.f(iF, 2, this));
            } else {
                this.f3872v0.post(new b8.f(iF, 2, this));
            }
        } else {
            this.f3868r0 = rVar;
            this.f3872v0.Y(iF);
        }
        P(iF);
    }

    public final void O(int i10) {
        this.f3869s0 = i10;
        if (i10 == 2) {
            this.f3871u0.getLayoutManager().o0(this.f3868r0.f3885c - ((b0) this.f3871u0.getAdapter()).f3849d.f3867q0.f3842a.f3885c);
            this.y0.setVisibility(0);
            this.z0.setVisibility(8);
            this.w0.setVisibility(8);
            this.x0.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.y0.setVisibility(8);
            this.z0.setVisibility(0);
            this.w0.setVisibility(0);
            this.x0.setVisibility(0);
            N(this.f3868r0);
        }
    }

    public final void P(int i10) {
        this.x0.setEnabled(i10 + 1 < this.f3872v0.getAdapter().a());
        this.w0.setEnabled(i10 - 1 >= 0);
    }

    @Override // w5.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f18763f;
        }
        this.f3866p0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3867q0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3868r0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // w5.t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i10;
        int i11;
        t6.w wVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f3866p0);
        this.f3870t0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.B0 = (AccessibilityManager) I().getSystemService("accessibility");
        r rVar = this.f3867q0.f3842a;
        if (p.Q(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.anonlab.voidlauncher.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.anonlab.voidlauncher.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = I().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = s.f3890d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.anonlab.voidlauncher.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.anonlab.voidlauncher.R.id.mtrl_calendar_days_of_week);
        l0.l(gridView, new g(0));
        int i13 = this.f3867q0.f3846e;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new e(i13) : new e()));
        gridView.setNumColumns(rVar.f3886d);
        gridView.setEnabled(false);
        this.f3872v0 = (RecyclerView) viewInflate.findViewById(com.anonlab.voidlauncher.R.id.mtrl_calendar_months);
        this.f3872v0.setLayoutManager(new h(this, i11, i11));
        this.f3872v0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f3867q0, new yh.c(this, 4));
        this.f3872v0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.anonlab.voidlauncher.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.anonlab.voidlauncher.R.id.mtrl_calendar_year_selector_frame);
        this.f3871u0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3871u0.setLayoutManager(new GridLayoutManager(integer));
            this.f3871u0.setAdapter(new b0(this));
            RecyclerView recyclerView4 = this.f3871u0;
            i iVar = new i();
            z.c(null);
            z.c(null);
            recyclerView4.f(iVar);
        }
        View viewFindViewById = viewInflate.findViewById(com.anonlab.voidlauncher.R.id.month_navigation_fragment_toggle);
        b bVar = vVar.f3899d;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.anonlab.voidlauncher.R.id.month_navigation_fragment_toggle);
            this.A0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            l0.l(this.A0, new j(this, 0));
            View viewFindViewById2 = viewInflate.findViewById(com.anonlab.voidlauncher.R.id.month_navigation_previous);
            this.w0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.anonlab.voidlauncher.R.id.month_navigation_next);
            this.x0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.y0 = viewInflate.findViewById(com.anonlab.voidlauncher.R.id.mtrl_calendar_year_selector_frame);
            this.z0 = viewInflate.findViewById(com.anonlab.voidlauncher.R.id.mtrl_calendar_day_selector_frame);
            O(1);
            this.A0.setText(this.f3868r0.e());
            this.f3872v0.g(new k(this, vVar));
            this.A0.setOnClickListener(new l(this, 0));
            this.x0.setOnClickListener(new f(this, vVar, 1));
            this.w0.setOnClickListener(new f(this, vVar, 0));
            P(bVar.f3842a.f(this.f3868r0));
        }
        if (!p.Q(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (wVar = new t6.w()).f16070a) != (recyclerView = this.f3872v0)) {
            w0 w0Var = wVar.f16071b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.y0;
                if (arrayList != null) {
                    arrayList.remove(w0Var);
                }
                wVar.f16070a.setOnFlingListener(null);
            }
            wVar.f16070a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                wVar.f16070a.g(w0Var);
                wVar.f16070a.setOnFlingListener(wVar);
                new Scroller(wVar.f16070a.getContext(), new DecelerateInterpolator());
                wVar.f();
            }
        }
        this.f3872v0.Y(bVar.f3842a.f(this.f3868r0));
        l0.l(this.f3872v0, new g(1));
        return viewInflate;
    }
}
