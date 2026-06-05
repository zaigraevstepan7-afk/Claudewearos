package t3;

import q.q0;
import s3.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f15686a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile q0 f15687b = new q0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f15688c;

    static {
        Object[] objArr = new Object[0];
        f15688c = objArr;
        synchronized (objArr) {
            f15687b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f15687b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f15687b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f15687b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f15687b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f15687b.f13121a[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float f11;
        a cVar;
        float[] fArr = f15686a;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVar = (a) f15687b.c(i10);
        if (aVar != null) {
            return aVar;
        }
        q0 q0Var = f15687b;
        int iA = r.a.a(q0Var.f13121a, q0Var.f13123c, i10);
        if (iA >= 0) {
            return (a) f15687b.e(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f15687b.f13123c) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar2);
            return cVar2;
        }
        if (i12 < 0) {
            cVar = new c(fArr, fArr);
            f11 = 1.0f;
        } else {
            f11 = f15687b.f13121a[i12] / 100.0f;
            cVar = (a) f15687b.e(i12);
        }
        float f12 = f15687b.f13121a[i11] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f11 == f12 ? 0.0f : (f10 - f11) / (f12 - f11))) * 1.0f) + 0.0f;
        a aVar2 = (a) f15687b.e(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f13 = fArr[i13];
            float fB = cVar.b(f13);
            fArr2[i13] = ((aVar2.b(f13) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f10, cVar3);
        return cVar3;
    }

    public static void b(float f10, c cVar) {
        synchronized (f15688c) {
            q0 q0VarB = f15687b.clone();
            q0VarB.d((int) (f10 * 100.0f), cVar);
            f15687b = q0VarB;
        }
    }
}
