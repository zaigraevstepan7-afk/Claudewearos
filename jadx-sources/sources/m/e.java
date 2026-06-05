package m;

import android.content.Context;
import android.view.View;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends l.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11077l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f11078m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Context context, l.h hVar2, View view) {
        super(context, hVar2, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f11078m = hVar;
        this.f9828f = 8388613;
        d8.e eVar = hVar.O;
        this.f9830h = eVar;
        l.j jVar = this.f9831i;
        if (jVar != null) {
            jVar.h(eVar);
        }
    }

    @Override // l.l
    public final void c() {
        switch (this.f11077l) {
            case 0:
                h hVar = this.f11078m;
                hVar.L = null;
                hVar.getClass();
                super.c();
                break;
            default:
                h hVar2 = this.f11078m;
                l.h hVar3 = hVar2.f11101c;
                if (hVar3 != null) {
                    hVar3.c(true);
                }
                hVar2.K = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Context context, l.r rVar, View view) {
        super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f11078m = hVar;
        if ((rVar.f9840x.f9818x & 32) != 32) {
            View view2 = hVar.A;
            this.f9827e = view2 == null ? hVar.f11105z : view2;
        }
        d8.e eVar = hVar.O;
        this.f9830h = eVar;
        l.j jVar = this.f9831i;
        if (jVar != null) {
            jVar.h(eVar);
        }
    }
}
