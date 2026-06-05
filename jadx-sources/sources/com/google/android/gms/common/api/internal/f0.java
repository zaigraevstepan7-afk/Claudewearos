package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3534b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.f3533a = i10;
        this.f3534b = obj;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z2) {
        switch (this.f3533a) {
            case 0:
                zau zauVar = ((h) this.f3534b).G;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z2)));
                break;
            default:
                if (!z2) {
                    ((jg.o) this.f3534b).f8900c = false;
                    jg.o oVar = (jg.o) this.f3534b;
                    if (oVar.f8898a > 0 && !oVar.f8900c) {
                        ((jg.o) this.f3534b).f8899b.a();
                        break;
                    }
                } else {
                    ((jg.o) this.f3534b).f8900c = true;
                    jg.g gVar = ((jg.o) this.f3534b).f8899b;
                    gVar.f8890d.removeCallbacks(gVar.f8891e);
                    break;
                }
                break;
        }
    }
}
