package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenw implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzenw(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static zzenx zzc(zzenw zzenwVar) {
        boolean z2;
        int iA;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) zzenwVar.zzb.getSystemService("audio");
        n nVar = n.D;
        float fA = nVar.f11583i.a();
        qc.b bVar = nVar.f11583i;
        synchronized (bVar) {
            z2 = bVar.f13336a;
        }
        if (audioManager == null) {
            return new zzenx(-1, false, false, -1, -1, -1, -1, -1, fA, z2, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlk)).booleanValue()) {
            iA = nVar.f11580f.a(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iA = -1;
            streamMaxVolume = -1;
        }
        return new zzenx(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iA, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fA, z2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenw.zzc(this.zza);
            }
        });
    }
}
