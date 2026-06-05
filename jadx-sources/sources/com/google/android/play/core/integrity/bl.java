package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f4081c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f4082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f4081c = bnVar;
        this.f4082d = new h0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, kf.z
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f4082d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f4081c.f4089f.a(bundle);
        if (jVarA != null) {
            this.f4075a.trySetException(jVarA);
        } else {
            this.f4075a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
