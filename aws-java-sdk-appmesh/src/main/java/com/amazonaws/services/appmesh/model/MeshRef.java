/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a service mesh returned by a list operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/MeshRef" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeshRef implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the service mesh.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the service mesh.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner, or another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     */
    private String resourceOwner;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the service mesh.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) of the service mesh.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the service mesh.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) of the service mesh.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the service mesh.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) of the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshRef withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @return The name of the service mesh.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshRef withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *         the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshRef withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner, or another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @param resourceOwner
     *        The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *        mesh owner, or another account that the mesh is shared with. For more information about mesh sharing, see
     *        <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared
     *        Meshes</a>.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner, or another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *         mesh owner, or another account that the mesh is shared with. For more information about mesh sharing, see
     *         <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared
     *         Meshes</a>.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner, or another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared Meshes</a>.
     * </p>
     * 
     * @param resourceOwner
     *        The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *        mesh owner, or another account that the mesh is shared with. For more information about mesh sharing, see
     *        <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with Shared
     *        Meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshRef withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshRef == false)
            return false;
        MeshRef other = (MeshRef) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        return hashCode;
    }

    @Override
    public MeshRef clone() {
        try {
            return (MeshRef) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.MeshRefMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
