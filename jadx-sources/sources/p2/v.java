package p2;

import android.view.MotionEvent;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12756a = new a(zzbch.zzq.zzf);

    /* renamed from: b, reason: collision with root package name */
    public static final a f12757b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f12758c;

    /* renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f12759d;

    static {
        new a(1007);
        f12757b = new a(1008);
        f12758c = new a(1002);
        f12759d = new StackTraceElement[0];
    }

    public static final boolean a(w wVar) {
        return (wVar.b() || wVar.f12767h || !wVar.f12763d) ? false : true;
    }

    public static final boolean b(w wVar) {
        return !wVar.f12767h && wVar.f12763d;
    }

    public static final boolean c(w wVar) {
        return (wVar.b() || !wVar.f12767h || wVar.f12763d) ? false : true;
    }

    public static final boolean d(w wVar) {
        return wVar.f12767h && !wVar.f12763d;
    }

    public static final boolean e(long j, long j4) {
        return j == j4;
    }

    public static final boolean f(w wVar, long j, long j4) {
        int i10 = wVar.f12768i == 1 ? 1 : 0;
        long j10 = wVar.f12762c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f10 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32)) * f10;
        float f11 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static v1.o g(v1.o oVar, a aVar) {
        return oVar.c(new q(aVar));
    }

    public static final long h(w wVar, boolean z2) {
        long jE = b2.b.e(wVar.f12762c, wVar.f12766g);
        if (z2 || !wVar.b()) {
            return jE;
        }
        return 0L;
    }

    public static final void i(n nVar, long j, ej.c cVar, boolean z2) {
        MotionEvent motionEventA = nVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z2) {
            motionEventA.setAction(3);
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        cVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventA.setAction(action);
    }

    public static String j(long j) {
        return "PointerId(value=" + j + ')';
    }
}
