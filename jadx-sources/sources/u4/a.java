package u4;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f16597a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16599c;

    public a(int i10, e eVar, int i11) {
        this.f16597a = i10;
        this.f16598b = eVar;
        this.f16599c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16597a);
        this.f16598b.f16615a.performAction(this.f16599c, bundle);
    }
}
