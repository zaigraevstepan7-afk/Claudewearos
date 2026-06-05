package androidx.lifecycle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f1057a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1058b;

    /* renamed from: c, reason: collision with root package name */
    public int f1059c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f1060d;

    public a0(b0 b0Var, c0 c0Var) {
        this.f1060d = b0Var;
        this.f1057a = c0Var;
    }

    public final void a(boolean z2) {
        if (z2 == this.f1058b) {
            return;
        }
        this.f1058b = z2;
        int i10 = z2 ? 1 : -1;
        b0 b0Var = this.f1060d;
        int i11 = b0Var.f1067c;
        b0Var.f1067c = i10 + i11;
        if (!b0Var.f1068d) {
            b0Var.f1068d = true;
            while (true) {
                try {
                    int i12 = b0Var.f1067c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z10 = i11 == 0 && i12 > 0;
                    boolean z11 = i11 > 0 && i12 == 0;
                    if (z10) {
                        b0Var.e();
                    } else if (z11) {
                        b0Var.f();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    b0Var.f1068d = false;
                    throw th2;
                }
            }
            b0Var.f1068d = false;
        }
        if (this.f1058b) {
            b0Var.c(this);
        }
    }

    public boolean d(t tVar) {
        return false;
    }

    public abstract boolean f();

    public void c() {
    }
}
