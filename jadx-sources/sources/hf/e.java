package hf;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q qVar, int i10) {
        super(qVar);
        this.f7909e = i10;
    }

    @Override // hf.r
    public void q() {
        switch (this.f7909e) {
            case 0:
                q qVar = this.f7947b;
                qVar.H = null;
                CheckableImageButton checkableImageButton = qVar.f7945z;
                checkableImageButton.setOnLongClickListener(null);
                x8.a.V(checkableImageButton, null);
                break;
        }
    }
}
