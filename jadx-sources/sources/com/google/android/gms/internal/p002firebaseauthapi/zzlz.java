package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzlz {
    private static final Object zza = new Object();
    private static final String zzb = "zzlz";
    private final zzce zzc;
    private final zzbh zzd;
    private zzcc zze;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbh zze = null;
        private boolean zzf = true;
        private zzbv zzg = null;
        private zzvc zzh = null;
        private zzcc zzi;

        private static zzcc zza(byte[] bArr) {
            return zzcc.zza(zzbm.zza(zzbk.zza(bArr)));
        }

        private final zzbh zzb() throws KeyStoreException {
            zzlz.zzd();
            zzmc zzmcVar = new zzmc();
            try {
                boolean zZzc = zzmc.zzc(this.zzd);
                try {
                    return zzmcVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zZzc) {
                        throw new KeyStoreException(m1.j("the master key ", this.zzd, " exists but is unusable"), e10);
                    }
                    Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final zza zza(zzvc zzvcVar) {
            this.zzh = zzvcVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public final zza zza(Context context, String str, String str2) {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzlz zza() {
            zzlz zzlzVar;
            try {
                if (this.zzb != null) {
                    zzvc zzvcVar = this.zzh;
                    if (zzvcVar != null && this.zzg == null) {
                        this.zzg = zzbv.zza(zzcp.zza(zzvcVar.a_()));
                    }
                    synchronized (zzlz.zza) {
                        try {
                            byte[] bArrZzb = zzb(this.zza, this.zzb, this.zzc);
                            if (bArrZzb == null) {
                                if (this.zzd != null) {
                                    this.zze = zzb();
                                }
                                if (this.zzg != null) {
                                    zzcc zzccVarZza = zzcc.zzb().zza(this.zzg);
                                    zzcc zzccVarZza2 = zzccVarZza.zza(zzccVarZza.zza().zzc().zza(0).zza());
                                    zzlz.zza(zzccVarZza2.zza(), new zzme(this.zza, this.zzb, this.zzc), this.zze);
                                    this.zzi = zzccVarZza2;
                                } else {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                            } else if (this.zzd != null) {
                                zzlz.zzd();
                                this.zzi = zzb(bArrZzb);
                            } else {
                                this.zzi = zza(bArrZzb);
                            }
                            zzlzVar = new zzlz(this);
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return zzlzVar;
        }

        private final zzcc zzb(byte[] bArr) {
            try {
                this.zze = new zzmc().zza(this.zzd);
                try {
                    return zzcc.zza(zzby.zza(zzbk.zza(bArr), this.zze));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzcc zzccVarZza = zza(bArr);
                    Log.w(zzlz.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zzccVarZza;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) throws CharConversionException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return zzxl.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(m1.j("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzby zza() {
        return this.zze.zza();
    }

    private zzlz(zza zzaVar) {
        this.zzc = new zzme(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzd = zzaVar.zze;
        this.zze = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzby zzbyVar, zzce zzceVar, zzbh zzbhVar) throws GeneralSecurityException {
        try {
            if (zzbhVar != null) {
                zzbyVar.zza(zzceVar, zzbhVar);
            } else {
                zzbm.zza(zzbyVar, zzceVar);
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
