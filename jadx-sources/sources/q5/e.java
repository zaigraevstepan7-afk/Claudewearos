package q5;

import com.google.android.gms.internal.ads.zzbch;
import s.v0;
import s.w0;
import t.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public float f13247a;

    /* renamed from: b, reason: collision with root package name */
    public float f13248b;

    public e(int i10) {
        switch (i10) {
            case 3:
                break;
            default:
                this.f13247a = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f13248b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    public v0 a(float f10) {
        double dB = b(f10);
        double d10 = w0.f14698a;
        double d11 = d10 - 1.0d;
        return new v0(f10, (float) (Math.exp((d10 / d11) * dB) * this.f13247a * this.f13248b), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = s.b.f14562a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f13247a * this.f13248b));
    }

    @Override // t.b0
    public float c() {
        return this.f13247a;
    }

    @Override // t.b0
    public float i(float f10, float f11, long j) {
        float f12 = this.f13248b;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // t.b0
    public long m(float f10) {
        return ((long) ((((float) Math.log(this.f13247a / Math.abs(f10))) * 1000.0f) / this.f13248b)) * 1000000;
    }

    @Override // t.b0
    public float n(float f10, float f11) {
        if (Math.abs(f11) <= this.f13247a) {
            return f10;
        }
        double dLog = Math.log(Math.abs(r1 / f11));
        float f12 = this.f13248b;
        return ((f11 / f12) * ((float) Math.exp((f12 * ((dLog / f12) * zzbch.zzq.zzf)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // t.b0
    public float q(long j, float f10) {
        return f10 * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f13248b));
    }
}
