package com.google.android.material.datepicker;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.anonlab.voidlauncher.R;
import m.a2;
import m.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3865b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f3864a = i10;
        this.f3865b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3864a) {
            case 0:
                m mVar = (m) this.f3865b;
                int i10 = mVar.f3869s0;
                if (i10 != 2) {
                    if (i10 == 1) {
                        mVar.O(2);
                        mVar.f3871u0.announceForAccessibility(mVar.I().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    mVar.O(1);
                    mVar.f3872v0.announceForAccessibility(mVar.I().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            case 1:
                w1 w1Var = ((Toolbar) this.f3865b).f824g0;
                l.i iVar = w1Var == null ? null : w1Var.f11200b;
                if (iVar != null) {
                    iVar.collapseActionView();
                    break;
                }
                break;
            case 2:
                a2 a2Var = (a2) this.f3865b;
                if (a2Var.f11057k != null) {
                    a2Var.getClass();
                    break;
                }
                break;
            default:
                pc.i iVar2 = (pc.i) this.f3865b;
                iVar2.O = 2;
                iVar2.f12841a.finish();
                break;
        }
    }

    public l(a2 a2Var) {
        this.f3864a = 2;
        this.f3865b = a2Var;
        a2Var.f11048a.getContext();
    }
}
