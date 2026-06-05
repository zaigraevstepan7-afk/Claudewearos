package x5;

import android.view.ViewGroup;
import fj.l;
import w5.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f19835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, ViewGroup viewGroup, int i10) {
        super(tVar, "Attempting to use <fragment> tag to add fragment " + tVar + " to container " + viewGroup);
        switch (i10) {
            case 1:
                l.f(tVar, "fragment");
                super(tVar, "Attempting to add fragment " + tVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f19835b = viewGroup;
                break;
            default:
                this.f19835b = viewGroup;
                break;
        }
    }
}
