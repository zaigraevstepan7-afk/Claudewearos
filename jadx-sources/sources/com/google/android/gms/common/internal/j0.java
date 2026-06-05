package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends b0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f3655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, int i10) {
        super(fVar, i10, null);
        this.f3655g = fVar;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void a(nd.b bVar) {
        f fVar = this.f3655g;
        if (fVar.enableLocalFallback() && f.zzo(fVar)) {
            f.zzk(fVar, 16);
        } else {
            fVar.zzc.a(bVar);
            fVar.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b0
    public final boolean b() {
        this.f3655g.zzc.a(nd.b.f12266e);
        return true;
    }
}
