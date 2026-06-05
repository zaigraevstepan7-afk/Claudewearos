package nc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m3 extends y {

    /* renamed from: a, reason: collision with root package name */
    public final fc.c f12148a;

    public m3(fc.c cVar) {
        this.f12148a = cVar;
    }

    @Override // nc.z
    public final void zzc() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdClicked();
        }
    }

    @Override // nc.z
    public final void zzd() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdClosed();
        }
    }

    @Override // nc.z
    public final void zzf(h2 h2Var) {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdFailedToLoad(h2Var.c());
        }
    }

    @Override // nc.z
    public final void zzg() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdImpression();
        }
    }

    @Override // nc.z
    public final void zzi() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }

    @Override // nc.z
    public final void zzj() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdOpened();
        }
    }

    @Override // nc.z
    public final void zzk() {
        fc.c cVar = this.f12148a;
        if (cVar != null) {
            cVar.onAdSwipeGestureClicked();
        }
    }

    @Override // nc.z
    public final void zzh() {
    }

    @Override // nc.z
    public final void zze(int i10) {
    }
}
