package com.google.android.gms.common.api;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(Status status) {
        int i10 = status.f3491a;
        String str = status.f3492b;
        super(i10 + ": " + (str == null ? "" : str));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f3491a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f3492b;
    }
}
