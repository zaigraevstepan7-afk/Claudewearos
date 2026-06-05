package d4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends c {
    public int A;
    public int B;
    public a4.a C;

    public boolean getAllowsGoneWidget() {
        return this.C.f73s0;
    }

    public int getMargin() {
        return this.C.f74t0;
    }

    public int getType() {
        return this.A;
    }

    @Override // d4.c
    public final void h(a4.d dVar, boolean z2) {
        int i10 = this.A;
        this.B = i10;
        if (z2) {
            if (i10 == 5) {
                this.B = 1;
            } else if (i10 == 6) {
                this.B = 0;
            }
        } else if (i10 == 5) {
            this.B = 0;
        } else if (i10 == 6) {
            this.B = 1;
        }
        if (dVar instanceof a4.a) {
            ((a4.a) dVar).f72r0 = this.B;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.C.f73s0 = z2;
    }

    public void setDpMargin(int i10) {
        this.C.f74t0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.C.f74t0 = i10;
    }

    public void setType(int i10) {
        this.A = i10;
    }
}
