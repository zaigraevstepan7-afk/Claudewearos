package j6;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import tj.r0;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f8730a;

    public m(k kVar) {
        this.f8730a = kVar;
    }

    public final void onBackCancelled() {
        k kVar = this.f8730a;
        s sVar = kVar.f8707a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!kVar.f8708b) {
            sVar.g(kVar, null);
        }
        g gVar = (g) sVar.f19380b;
        gVar.getClass();
        if (kVar.equals(gVar.f8716h) && -1 == gVar.f8715g) {
            d dVarC = gVar.f8714f;
            if (dVarC == null) {
                dVarC = gVar.c(-1);
            }
            gVar.f8714f = null;
            gVar.f8715g = 0;
            gVar.f8716h = null;
            if (dVarC != null) {
                dVarC.a();
            }
            r0 r0Var = gVar.f8709a;
            r0Var.getClass();
            r0Var.k(null, h.f8722f);
        }
        kVar.f8708b = false;
    }

    public final void onBackInvoked() {
        this.f8730a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        fj.l.f(backEvent, "backEvent");
        b bVarC = mk.b.c(backEvent);
        k kVar = this.f8730a;
        s sVar = kVar.f8707a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (kVar.f8708b) {
            g gVar = (g) sVar.f19380b;
            gVar.getClass();
            if (kVar.equals(gVar.f8716h) && -1 == gVar.f8715g) {
                d dVarC = gVar.f8714f;
                if (dVarC == null) {
                    dVarC = gVar.c(-1);
                }
                if (dVarC != null) {
                    dVarC.c(bVarC);
                }
                r0 r0Var = gVar.f8709a;
                i iVar = new i(bVarC);
                r0Var.getClass();
                r0Var.k(null, iVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        fj.l.f(backEvent, "backEvent");
        b bVarC = mk.b.c(backEvent);
        k kVar = this.f8730a;
        s sVar = kVar.f8707a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (kVar.f8708b) {
            return;
        }
        sVar.g(kVar, bVarC);
        kVar.f8708b = true;
    }
}
