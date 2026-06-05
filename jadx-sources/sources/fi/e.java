package fi;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements i, s3.c {
    public final /* synthetic */ f A;

    /* renamed from: e, reason: collision with root package name */
    public float f6758e;

    /* renamed from: f, reason: collision with root package name */
    public RenderEffect f6759f;

    /* renamed from: a, reason: collision with root package name */
    public float f6754a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f6755b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public long f6756c = 9205357640488583168L;

    /* renamed from: d, reason: collision with root package name */
    public m f6757d = m.f14752a;

    /* renamed from: z, reason: collision with root package name */
    public final ld.i f6760z = new ld.i(8);

    public e(f fVar) {
        this.A = fVar;
    }

    @Override // s3.c
    public final float e() {
        return this.f6754a;
    }

    @Override // fi.i
    public final RuntimeShader f(String str, String str2) {
        return this.f6760z.f(str, str2);
    }

    @Override // s3.c
    public final float r0() {
        return this.f6755b;
    }
}
