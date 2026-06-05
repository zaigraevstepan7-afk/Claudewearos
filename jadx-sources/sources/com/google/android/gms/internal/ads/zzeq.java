package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeq implements zzds {
    private Message zza;

    private zzeq() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzes.zzm(this);
    }

    public final zzeq zzb(Message message, zzes zzesVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzes.zzm(this);
        return zSendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzeq(zzer zzerVar) {
    }
}
