package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import fc.n;
import fc.o;
import fc.p;
import fc.q;
import fc.t;
import java.util.ArrayList;
import java.util.List;
import nc.i2;
import nc.i3;
import nc.q1;
import nc.s1;
import nc.t1;
import nc.x2;
import nc.z2;
import rc.k;
import wc.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsx extends NativeAd {
    private final zzbih zza;
    private final zzbsw zzc;
    private final wc.c zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    public zzbsx(zzbih zzbihVar) {
        zzbgn zzbgnVarZzk;
        this.zza = zzbihVar;
        zzbsu zzbsuVar = null;
        try {
            List listZzu = zzbihVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    zzbgn zzbgnVarZzg = obj instanceof IBinder ? zzbgm.zzg((IBinder) obj) : null;
                    if (zzbgnVarZzg != null) {
                        this.zzb.add(new zzbsw(zzbgnVarZzg));
                    }
                }
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    s1 s1VarN = obj2 instanceof IBinder ? x2.n((IBinder) obj2) : null;
                    if (s1VarN != null) {
                        this.zze.add(new t1(s1VarN));
                    }
                }
            }
        } catch (RemoteException e11) {
            k.e("", e11);
        }
        try {
            zzbgnVarZzk = this.zza.zzk();
        } catch (RemoteException e12) {
            k.e("", e12);
        }
        zzbsw zzbswVar = zzbgnVarZzk != null ? new zzbsw(zzbgnVarZzk) : null;
        this.zzc = zzbswVar;
        try {
            if (this.zza.zzi() != null) {
                zzbsuVar = new zzbsu(this.zza.zzi());
            }
        } catch (RemoteException e13) {
            k.e("", e13);
        }
        this.zzd = zzbsuVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e10) {
            k.e("Failed to cancelUnconfirmedClick", e10);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final wc.c getAdChoicesInfo() {
        return this.zzd;
    }

    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.zza.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final wc.d getIcon() {
        return this.zzc;
    }

    public final List<wc.d> getImages() {
        return this.zzb;
    }

    public final n getMediaContent() {
        try {
            zzbih zzbihVar = this.zza;
            if (zzbihVar.zzj() != null) {
                return new z2(zzbihVar.zzj(), null);
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        return null;
    }

    public final List<p> getMuteThisAdReasons() {
        return this.zze;
    }

    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final t getResponseInfo() {
        i2 i2VarZzg;
        try {
            i2VarZzg = this.zza.zzg();
        } catch (RemoteException e10) {
            k.e("", e10);
            i2VarZzg = null;
        }
        if (i2VarZzg != null) {
            return new t(i2VarZzg);
        }
        return null;
    }

    public final Double getStarRating() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e10) {
            k.e("", e10);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e10) {
            k.e("", e10);
            return false;
        }
    }

    public final void muteThisAd(p pVar) {
        try {
            try {
                if (this.zza.zzI()) {
                    if (pVar == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (pVar instanceof t1) {
                        this.zza.zzy(((t1) pVar).f12232b);
                        return;
                    } else {
                        k.d("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e10) {
                k.e("", e10);
            }
            k.d("Ad is not custom mute enabled");
        } catch (RemoteException e11) {
            k.e("", e11);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e10) {
            k.e("Failed to record native event", e10);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void setMuteThisAdListener(o oVar) {
        try {
            this.zza.zzE(new q1("com.google.android.gms.ads.internal.client.IMuteThisAdListener"));
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void setOnPaidEventListener(q qVar) {
        try {
            this.zza.zzF(new i3());
        } catch (RemoteException e10) {
            k.e("Failed to setOnPaidEventListener", e10);
        }
    }

    public final void setUnconfirmedClickListener(f fVar) {
        try {
            this.zza.zzG(new zzbte(fVar));
        } catch (RemoteException e10) {
            k.e("Failed to setUnconfirmedClickListener", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }
}
