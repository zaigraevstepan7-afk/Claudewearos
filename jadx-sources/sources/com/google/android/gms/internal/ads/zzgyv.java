package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzgyp;
import com.google.android.gms.internal.ads.zzgyv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgyv<MessageType extends zzgyv<MessageType, BuilderType>, BuilderType extends zzgyp<MessageType, BuilderType>> extends zzgww<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgyv<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhbm zzt = zzhbm.zzc();

    public static zzgyx zzbA() {
        return zzgxd.zzd();
    }

    public static zzgyx zzbB(zzgyx zzgyxVar) {
        int size = zzgyxVar.size();
        return zzgyxVar.zzf(size + size);
    }

    public static zzgyy zzbC() {
        return zzgyc.zze();
    }

    public static zzgyy zzbD(zzgyy zzgyyVar) {
        int size = zzgyyVar.size();
        return zzgyyVar.zzf(size + size);
    }

    public static zzgzc zzbE() {
        return zzgym.zze();
    }

    public static zzgzc zzbF(zzgzc zzgzcVar) {
        int size = zzgzcVar.size();
        return zzgzcVar.zzf(size + size);
    }

    public static zzgzd zzbG() {
        return zzgyw.zzg();
    }

    public static zzgzd zzbH(zzgzd zzgzdVar) {
        int size = zzgzdVar.size();
        return zzgzdVar.zzf(size + size);
    }

    public static zzgzg zzbI() {
        return zzgzv.zzh();
    }

    public static zzgzg zzbJ(zzgzg zzgzgVar) {
        int size = zzgzgVar.size();
        return zzgzgVar.zzf(size + size);
    }

    public static <E> zzgzh<E> zzbK() {
        return zzhar.zzd();
    }

    public static <E> zzgzh<E> zzbL(zzgzh<E> zzgzhVar) {
        int size = zzgzhVar.size();
        return zzgzhVar.zzf(size + size);
    }

    public static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbQ(zzhag zzhagVar, String str, Object[] objArr) {
        return new zzhas(zzhagVar, str, objArr);
    }

    public static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(m1.k("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e10);
        }
    }

    public static <T extends zzgyv> void zzbZ(Class<T> cls, T t10) {
        t10.zzbV();
        zzc.put(cls, t10);
    }

    public static <ContainingType extends zzhag, Type> zzgyt<ContainingType, Type> zzbe(ContainingType containingtype, zzhag zzhagVar, zzgza zzgzaVar, int i10, zzhby zzhbyVar, boolean z2, Class cls) {
        return new zzgyt<>(containingtype, zzhar.zzd(), zzhagVar, new zzgys(zzgzaVar, i10, zzhbyVar, true, z2), cls);
    }

    public static <ContainingType extends zzhag, Type> zzgyt<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhag zzhagVar, zzgza zzgzaVar, int i10, zzhby zzhbyVar, Class cls) {
        return new zzgyt<>(containingtype, type, zzhagVar, new zzgys(zzgzaVar, i10, zzhbyVar, false, false), cls);
    }

    public static <T extends zzgyv> T zzbh(Class<T> cls) throws ClassNotFoundException {
        zzgyv<?, ?> zzgyvVar = zzc.get(cls);
        if (zzgyvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyvVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgyvVar != null) {
            return zzgyvVar;
        }
        zzgyv<?, ?> zzgyvVarZzbt = ((zzgyv) zzhbs.zzg(cls)).zzbt();
        if (zzgyvVarZzbt == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, zzgyvVarZzbt);
        return zzgyvVarZzbt;
    }

    public static <T extends zzgyv<T, ?>> T zzbk(T t10, InputStream inputStream) throws zzgzk {
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        T t11 = (T) zzg(t10, inputStream, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbl(T t10, InputStream inputStream, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzg(t10, inputStream, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbm(T t10, zzgxn zzgxnVar) throws zzgzk {
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        T t11 = (T) zzbr(t10, zzgxnVar, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbn(T t10, zzgxt zzgxtVar) {
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        return (T) zzbs(t10, zzgxtVar, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbo(T t10, InputStream inputStream) throws zzgzk {
        zzgxt zzgxtVarZzG = zzgxt.zzG(inputStream, 4096);
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        T t11 = (T) zzbz(t10, zzgxtVarZzG, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbp(T t10, ByteBuffer byteBuffer) {
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        return (T) zzbv(t10, byteBuffer, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbq(T t10, byte[] bArr) throws zzgzk {
        int length = bArr.length;
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        T t11 = (T) zzi(t10, bArr, 0, length, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbr(T t10, zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzh(t10, zzgxnVar, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbs(T t10, zzgxt zzgxtVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzbz(t10, zzgxtVar, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbu(T t10, InputStream inputStream, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzbz(t10, zzgxt.zzG(inputStream, 4096), zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbv(T t10, ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
        zzgxt zzgxtVarZzH;
        boolean z2 = false;
        if (byteBuffer.hasArray()) {
            zzgxtVarZzH = zzgxt.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhbs.zzB()) {
            zzgxtVarZzH = new zzgxr(byteBuffer, z2, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgxtVarZzH = zzgxt.zzH(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbs(t10, zzgxtVarZzH, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbx(T t10, byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzi(t10, bArr, 0, bArr.length, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzby(T t10, zzgxt zzgxtVar) {
        int i10 = zzgyf.zzb;
        int i11 = zzhaq.zza;
        return (T) zzbz(t10, zzgxtVar, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbz(T t10, zzgxt zzgxtVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) t10.zzbj();
        try {
            zzhaz zzhazVarZzb = zzhaq.zza().zzb(t11.getClass());
            zzhazVarZzb.zzh(t11, zzgxu.zzq(zzgxtVar), zzgyfVar);
            zzhazVarZzb.zzf(t11);
            return t11;
        } catch (zzgzk e10) {
            if (e10.zzb()) {
                throw new zzgzk(e10);
            }
            throw e10;
        } catch (zzhbk e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgzk) {
                throw ((zzgzk) e12.getCause());
            }
            throw new zzgzk(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgzk) {
                throw ((zzgzk) e13.getCause());
            }
            throw e13;
        }
    }

    private int zzc(zzhaz<?> zzhazVar) {
        if (zzhazVar != null) {
            return zzhazVar.zza(this);
        }
        return zzhaq.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgyr<MessageType, BuilderType>, BuilderType, T> zzgyt<MessageType, T> zzd(zzgyd<MessageType, T> zzgydVar) {
        return (zzgyt) zzgydVar;
    }

    private static <T extends zzgyv<T, ?>> T zzf(T t10) throws zzgzk {
        if (t10 == null || t10.zzbw()) {
            return t10;
        }
        throw t10.zzaP().zza();
    }

    private static <T extends zzgyv<T, ?>> T zzg(T t10, InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            zzgxt zzgxtVarZzG = zzgxt.zzG(new zzgwu(inputStream, zzgxt.zzE(i10, inputStream)), 4096);
            T t11 = (T) zzbz(t10, zzgxtVarZzG, zzgyfVar);
            zzgxtVarZzG.zzy(0);
            return t11;
        } catch (zzgzk e10) {
            if (e10.zzb()) {
                throw new zzgzk(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzgzk(e11);
        }
    }

    private static <T extends zzgyv<T, ?>> T zzh(T t10, zzgxn zzgxnVar, zzgyf zzgyfVar) {
        zzgxt zzgxtVarZzl = zzgxnVar.zzl();
        T t11 = (T) zzbz(t10, zzgxtVarZzl, zzgyfVar);
        zzgxtVarZzl.zzy(0);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgyv<T, ?>> T zzi(T t10, byte[] bArr, int i10, int i11, zzgyf zzgyfVar) throws zzgzk {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbj();
        try {
            zzhaz zzhazVarZzb = zzhaq.zza().zzb(t11.getClass());
            zzhazVarZzb.zzi(t11, bArr, i10, i10 + i11, new zzgxb(zzgyfVar));
            zzhazVarZzb.zzf(t11);
            return t11;
        } catch (zzgzk e10) {
            if (e10.zzb()) {
                throw new zzgzk(e10);
            }
            throw e10;
        } catch (zzhbk e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgzk) {
                throw ((zzgzk) e12.getCause());
            }
            throw new zzgzk(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhbm.zzc()) {
            this.zzt = zzhbm.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzgyv<T, ?>> boolean zzk(T t10, boolean z2) {
        byte bByteValue = ((Byte) t10.zzdd(zzgyu.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhaq.zza().zzb(t10.getClass()).zzl(t10);
        if (z2) {
            t10.zzdd(zzgyu.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhaq.zza().zzb(getClass()).zzk(this, (zzgyv) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhai.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public int zzaL() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public int zzaM(zzhaz zzhazVar) {
        if (zzcd()) {
            int iZzc = zzc(zzhazVar);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(m6.a.d(iZzc, "serialized size must be non-negative, was "));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int iZzc2 = zzc(zzhazVar);
        zzaS(iZzc2);
        return iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public zzhal zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public void zzaS(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(m6.a.d(i10, "serialized size must be non-negative, was "));
        }
        this.zzd = i10 | (this.zzd & zza);
    }

    public int zzaW() {
        return zzhaq.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType2 extends zzgyv<MessageType2, BuilderType2>, BuilderType2 extends zzgyp<MessageType2, BuilderType2>> BuilderType2 zzaZ() {
        return (BuilderType2) zzdd(zzgyu.NEW_BUILDER, null, null);
    }

    public final zzhao<MessageType> zzbN() {
        return (zzhao) zzdd(zzgyu.GET_PARSER, null, null);
    }

    public Object zzbO() {
        return zzdd(zzgyu.BUILD_MESSAGE_INFO, null, null);
    }

    public void zzbS() {
        this.zzq = 0;
    }

    public void zzbT() {
        zzaS(f.API_PRIORITY_OTHER);
    }

    public void zzbU() {
        zzhaq.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    public void zzbV() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public void zzbW(int i10, zzgxn zzgxnVar) {
        zzj();
        zzhbm zzhbmVar = this.zzt;
        zzhbmVar.zzg();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhbmVar.zzj((i10 << 3) | 2, zzgxnVar);
    }

    public final void zzbX(zzhbm zzhbmVar) {
        this.zzt = zzhbm.zze(this.zzt, zzhbmVar);
    }

    public void zzbY(int i10, int i11) {
        zzj();
        zzhbm zzhbmVar = this.zzt;
        zzhbmVar.zzg();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhbmVar.zzj(i10 << 3, Long.valueOf(i11));
    }

    public final <MessageType2 extends zzgyv<MessageType2, BuilderType2>, BuilderType2 extends zzgyp<MessageType2, BuilderType2>> BuilderType2 zzba(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzaZ();
        buildertype2.zzbj(messagetype2);
        return buildertype2;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdd(zzgyu.NEW_BUILDER, null, null);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdd(zzgyu.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzdd(zzgyu.GET_DEFAULT_INSTANCE, null, null);
    }

    public MessageType zzbj() {
        return (MessageType) zzdd(zzgyu.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public void zzcZ(zzgya zzgyaVar) {
        zzhaq.zza().zzb(getClass()).zzj(this, zzgyb.zza(zzgyaVar));
    }

    public void zzca(int i10) {
        this.zzq = i10;
    }

    public boolean zzcc() {
        return zzaX() == 0;
    }

    public boolean zzcd() {
        return (this.zzd & zza) != 0;
    }

    public boolean zzce(int i10, zzgxt zzgxtVar) {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i10, zzgxtVar);
    }

    public abstract Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2);
}
