package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcj {
    private static AudioManager zza;

    public static int zza(AudioManager audioManager, zzch zzchVar) {
        return audioManager.abandonAudioFocusRequest(zzchVar.zza());
    }

    public static int zzb(AudioManager audioManager, zzch zzchVar) {
        return audioManager.requestAudioFocus(zzchVar.zza());
    }

    public static synchronized AudioManager zzc(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final zzdm zzdmVar = new zzdm(zzdj.zza);
                zzde.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcj.zzd(applicationContext, zzdmVar);
                    }
                });
                zzdmVar.zzb();
                AudioManager audioManager2 = zza;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void zzd(Context context, zzdm zzdmVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdmVar.zzf();
    }
}
