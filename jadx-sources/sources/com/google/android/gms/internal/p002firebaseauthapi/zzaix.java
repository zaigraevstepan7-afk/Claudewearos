package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaix<T extends zzaiz<T>> {
    private static final zzaix zzb = new zzaix(true);
    final zzali<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzaix() {
        this.zza = zzali.zza(16);
    }

    public static int zza(zzamt zzamtVar, int i10, Object obj) {
        int iZzi = zzaim.zzi(i10);
        if (zzamtVar == zzamt.zzj) {
            zzajh.zza((zzakp) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzamtVar, obj);
    }

    public static <T extends zzaiz<T>> zzaix<T> zzb() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzaix zzaixVar = new zzaix();
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i10);
            zzaixVar.zzb((zzaiz) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzaixVar.zzb((zzaiz) entry.getKey(), entry.getValue());
        }
        zzaixVar.zzd = this.zzd;
        return zzaixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaix) {
            return this.zza.equals(((zzaix) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzajq(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzajq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i10);
            if (entryZzb.getValue() instanceof zzaje) {
                ((zzaje) entryZzb.getValue()).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzajp;
        if (key.zze()) {
            if (z2) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzaix<T>) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.zza((zzali<T, Object>) key, (T) objZza);
            return;
        }
        if (key.zzc() != zzand.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzali<T, Object>) key, (T) zza(value));
            return;
        }
        Object objZza2 = zza((zzaix<T>) key);
        if (objZza2 != null) {
            if (z2) {
                value = zzajp.zza();
            }
            this.zza.zza((zzali<T, Object>) key, (T) (objZza2 instanceof zzaku ? key.zza((zzaku) objZza2, (zzaku) value) : key.zza(((zzakp) objZza2).zzr(), (zzakp) value).zzf()));
        } else {
            this.zza.zza((zzali<T, Object>) key, (T) zza(value));
            if (z2) {
                this.zzd = true;
            }
        }
    }

    private zzaix(zzali<T, Object> zzaliVar) {
        this.zza = zzaliVar;
        zze();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzamt r0 = r3.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzajh.zza(r4)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaiw.zza
            com.google.android.gms.internal.firebase-auth-api.zzand r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakp
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajp
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajg
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaho
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.firebase-auth-api.zzamt r3 = r3.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzand r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaix.zzc(com.google.android.gms.internal.firebase-auth-api.zzaiz, java.lang.Object):void");
    }

    private static int zza(zzamt zzamtVar, Object obj) {
        switch (zzaiw.zzb[zzamtVar.ordinal()]) {
            case 1:
                return zzaim.zza(((Double) obj).doubleValue());
            case 2:
                return zzaim.zza(((Float) obj).floatValue());
            case 3:
                return zzaim.zzd(((Long) obj).longValue());
            case 4:
                return zzaim.zzg(((Long) obj).longValue());
            case 5:
                return zzaim.zze(((Integer) obj).intValue());
            case 6:
                return zzaim.zzc(((Long) obj).longValue());
            case 7:
                return zzaim.zzd(((Integer) obj).intValue());
            case 8:
                return zzaim.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaim.zza((zzakp) obj);
            case 10:
                if (obj instanceof zzajp) {
                    return zzaim.zza((zzajp) obj);
                }
                return zzaim.zzb((zzakp) obj);
            case 11:
                if (obj instanceof zzaho) {
                    return zzaim.zza((zzaho) obj);
                }
                return zzaim.zza((String) obj);
            case 12:
                if (obj instanceof zzaho) {
                    return zzaim.zza((zzaho) obj);
                }
                return zzaim.zza((byte[]) obj);
            case 13:
                return zzaim.zzj(((Integer) obj).intValue());
            case 14:
                return zzaim.zzg(((Integer) obj).intValue());
            case 15:
                return zzaim.zze(((Long) obj).longValue());
            case 16:
                return zzaim.zzh(((Integer) obj).intValue());
            case 17:
                return zzaim.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzajg) {
                    return zzaim.zzc(((zzajg) obj).zza());
                }
                return zzaim.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private zzaix(boolean z2) {
        this(zzali.zza(0));
        zze();
    }

    private static <T extends zzaiz<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzand.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t10, Object obj) {
        if (t10.zze()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    zzc(t10, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t10, obj);
        }
        if (obj instanceof zzajp) {
            this.zzd = true;
        }
        this.zza.zza((zzali<T, Object>) t10, (T) obj);
    }

    public static int zza(zzaiz<?> zzaizVar, Object obj) {
        zzamt zzamtVarZzb = zzaizVar.zzb();
        int iZza = zzaizVar.zza();
        if (zzaizVar.zze()) {
            List list = (List) obj;
            int iZza2 = 0;
            if (zzaizVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iZza2 += zza(zzamtVarZzb, it.next());
                }
                return zzaim.zzj(iZza2) + zzaim.zzi(iZza) + iZza2;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iZza2 += zza(zzamtVarZzb, iZza, it2.next());
            }
            return iZza2;
        }
        return zza(zzamtVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakr) {
            return ((zzakr) obj).zzk();
        }
        if (obj instanceof zzajp) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZza = 0;
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            iZza += zza((Map.Entry) this.zza.zzb(i10));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzand.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzajp) {
                return zzaim.zza(entry.getKey().zza(), (zzajp) value);
            }
            return zzaim.zza(entry.getKey().zza(), (zzakp) value);
        }
        return zza((zzaiz<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaku) {
            return ((zzaku) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        return obj instanceof zzajp ? zzajp.zza() : obj;
    }

    public final void zza(zzaix<T> zzaixVar) {
        for (int i10 = 0; i10 < zzaixVar.zza.zza(); i10++) {
            zzb((Map.Entry) zzaixVar.zza.zzb(i10));
        }
        Iterator it = zzaixVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzaim zzaimVar, zzamt zzamtVar, int i10, Object obj) {
        if (zzamtVar == zzamt.zzj) {
            zzakp zzakpVar = (zzakp) obj;
            zzajh.zza(zzakpVar);
            zzaimVar.zzk(i10, 3);
            zzakpVar.zza(zzaimVar);
            zzaimVar.zzk(i10, 4);
        }
        zzaimVar.zzk(i10, zzamtVar.zza());
        switch (zzaiw.zzb[zzamtVar.ordinal()]) {
            case 1:
                zzaimVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaimVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaimVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzaimVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzaimVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzaimVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzaimVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzaimVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzakp) obj).zza(zzaimVar);
                break;
            case 10:
                zzaimVar.zzc((zzakp) obj);
                break;
            case 11:
                if (obj instanceof zzaho) {
                    zzaimVar.zzb((zzaho) obj);
                    break;
                } else {
                    zzaimVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzaho) {
                    zzaimVar.zzb((zzaho) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaimVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzaimVar.zzn(((Integer) obj).intValue());
                break;
            case 14:
                zzaimVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzaimVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzaimVar.zzm(((Integer) obj).intValue());
                break;
            case 17:
                zzaimVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzajg) {
                    zzaimVar.zzl(((zzajg) obj).zza());
                    break;
                } else {
                    zzaimVar.zzl(((Integer) obj).intValue());
                    break;
                }
        }
    }
}
